package labs.Practice4Part2.Task9;

import java.util.Scanner;

class Cart {
    public String password;
    public String numberCard; // Добавляем номер карты

    public Cart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль (4 символа): ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.length() == 4) {
            this.password = inputPassword;
            System.out.println("Пароль сохранен");
        } else {
            System.out.println("Ошибка! Пароль должен быть 4 символа.");
            // Возможно, добавить повторный ввод пароля?
        }
        scanner.close();
    }

    public String createCart(String numberCard, String password) {
        if (password.length() == 4) {
            this.numberCard = numberCard;
            this.password = password;
            return numberCard; // Возвращаем сообщение об успешном создании
        } else {
            return "Ошибка! Пароль должен быть 4 символа.";
        }
    }
}