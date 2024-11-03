package labs.Practice4Part2.Task9;

import java.util.Scanner;


public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank TBank = new Bank(); // Создаем банк без карты

        // Создаем объект Cart и вызываем метод createCart
        Cart cart = new Cart();
        String cardNumber = cart.createCart("34535", "2345"); // Сохраняем номер карты

        //  Вставляем карту в банкомат (передаем объект cart)
        TBank.insertCard(cardNumber);  // Передаем только номер карты

        while (true) { // Бесконечный цикл для работы с банком
            System.out.println("\nВыберите действие:");
            System.out.println("1. Вставить карту");
            System.out.println("2. Выйти");

            if (sc.hasNextInt()) { // Проверка, есть ли следующее целое число
                int choice = sc.nextInt();
                sc.nextLine(); // Считываем символ новой строки после ввода числа

                if (choice == 1) {
                    //  Вместо ввода номера карты, предлагаем выбрать другую карту
                    System.out.println("Выберите карту:");
                    System.out.println("1. Вставить карту " + cardNumber); // Предлагаем текущую карту
                    System.out.println("2. Вставить другую карту");

                    if (sc.hasNextInt()) {
                        int cardChoice = sc.nextInt();
                        sc.nextLine();
                        if (cardChoice == 1) {
                            // Используем уже существующий объект cart
                            TBank.currentCard = cart; // Вставляем существующую карту
                            TBank.lastEnteredPassword = cart.password; // Сохраняем пароль
                            while (!TBank.isBlocked) { // Цикл проверки пароля
                                System.out.print("Введите пароль карты: ");
                                //  Проверка наличия строки перед чтением
                                if (sc.hasNextLine()) {
                                    String password = sc.nextLine();

                                    if (TBank.checkCredentials(password)) {
                                        System.out.println("Пароль верный");
                                        break; // Выходим из цикла, если пароль верный
                                    } else {
                                        System.out.println("Неверно, осталось попыток: " + (Bank.MAX_ATTEMPTS - TBank.failedAttempts));
                                    }
                                } else {
                                    System.out.println("Ошибка: введите пароль.");
                                }
                            }

                            if (TBank.isBlocked) {
                                System.out.println("Ваша карта заблокирована.");
                            }
                        } else if (cardChoice == 2) {
                            System.out.print("Введите номер карты: ");
                            String newCardNumber = sc.nextLine();
                            TBank.insertCard(newCardNumber); // Вставляем новую карту
                            if (TBank.currentCard != null) {
                                // Проверка пароля для новой карты (реализуйте самостоятельно)
                                // ...
                            } else {
                                System.out.println("Неверный номер карты.");
                            }
                        } else {
                            System.out.println("Неверный выбор.");
                        }
                    } else {
                        System.out.println("Ошибка: введите целое число.");
                        sc.nextLine(); // Очистка буфера ввода
                    }

                } else if (choice == 2) {
                    break; // Выходим из программы
                } else {
                    System.out.println("Неверный выбор.");
                }
            } else { //  Если введен не int
                System.out.println("Ошибка: введите целое число.");
                sc.nextLine(); //  Очистка буфера ввода
            }
        }

        sc.close();
    }
}
