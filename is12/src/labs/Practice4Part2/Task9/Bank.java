package labs.Practice4Part2.Task9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Bank {
    public static final int MAX_ATTEMPTS = Integer.parseInt(String.valueOf(3));
    private Cart cart; // Храним объект Cart
    boolean isBlocked = false;
    int failedAttempts = 0; // Счетчик неудачных попыток
    String lastEnteredPassword = null; // Переменная для хранения последнего введенного пароля



    public Bank(Cart cart) {
        this.cart = cart;
        lastEnteredPassword = "";

        Scanner sc = new Scanner(System.in);

        if (!isBlocked) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Введите пароль карты: ");
                String password = sc.nextLine();
                lastEnteredPassword = password; // Сохраняем введенный пароль
                if (checkCredentials(password)) {
                    System.out.println("Пароль верный");
                    break; // Выходим из цикла, если пароль верный
                } else {
                    System.out.println("Неверно, осталось попыток: " + (2 - i)); // Осталось (2 - i) попыток
                }
            }
        }
    }

    boolean checkCredentials(String enteredPassword) {
        if (isBlocked) {
            return false;
        }

        lastEnteredPassword = enteredPassword; // Сохраняем введенный пароль

        if (enteredPassword.equals(cart.getPassword())) {
            resetFailedAttempts(); // Сброс счетчика при успешной попытке
            return true;
        } else {
            failedAttempts++;
            if (failedAttempts >= MAX_ATTEMPTS) {
                block();
            }
            return false;
        }
    }

    public void block() {
        isBlocked = true;
        System.out.println("Ваша карта заблокирована.");
    }

    public void unblock() {
        isBlocked = false;
        System.out.println("Ваша карта разблокирована.");
    }

    public void resetFailedAttempts() {
        failedAttempts = 0;
    }

    public boolean checkSavedPassword(String enteredPassword) {
        lastEnteredPassword = enteredPassword;
        try (BufferedReader reader = new BufferedReader(new FileReader("password.txt"))) {
            String savedPassword = reader.readLine();
            if (savedPassword != null && savedPassword.equals(enteredPassword)) {
                return true;
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении пароля из файла: " + e.getMessage());
        }
        return false; // Пароль не найден или не совпадает
    }

    public void savePasswordToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(lastEnteredPassword);
            System.out.println("Пароль сохранен в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи пароля в файл: " + e.getMessage());
        }
    }
}