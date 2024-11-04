package labs.Practice4Part2.Task_9;

import java.util.Scanner;


import java.util.HashMap;
import java.util.Map;


public class Bankomat {

    private static final int MAX_ATTEMPTS = 3; // Максимальное количество попыток ввода PIN-кода
    private static String correctPIN; // Правильный PIN-код для карты
    private static Map<String, Boolean> cardStatusMap = new HashMap<>(); // Статус блокировки карт


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Примеры создания карт
        String card1 = createCart("3456345674567543", "3456"); // Корректная карта
        System.out.println(card1);

        // Вставка карт
        insertCard("3456345674567543");
        System.out.println(isCardBlocked("3456345674567543"));

        scanner.close();
    }

    /**
     * Метод для вставки карты.
     *
     * @param numberCardInput Номер карты, который вводит пользователь.
     * @return Сообщение о результате операции.
     */
    public static String insertCard(String numberCardInput) {
        // Проверяем, существует ли карта и не заблокирована ли она
        if (cardStatusMap.containsKey(numberCardInput)) {
            if (isCardBlocked(numberCardInput)) {
                System.out.println("Ваша банковская карта заблокирована.");
                return "";
            }

            Scanner scanner = new Scanner(System.in);
            if (checkPIN(scanner, numberCardInput)) {
                System.out.println("Ваш PIN-код верен.");
                return "";
            } else {
                System.out.println("Ваша банковская карта заблокирована.");
                return "";
            }
        } else {
            System.out.println("Неверный номер карты.");
            return "";
        }
    }

    /**
     * Метод для создания карты.
     *
     * @param numberCard Номер карты.
     * @param pin        PIN-код для карты.
     * @return Сообщение об успешном создании карты или ошибке.
     */
    public static String createCart(String numberCard, String pin) {
        correctPIN = pin;
        cardStatusMap.put(numberCard, false); // Инициализация статуса карты как не заблокированной

        if (numberCard.length() != 16 || pin.length() != 4 || !numberCard.matches("[0-9]+") || !pin.matches("[0-9]+")) {
            System.out.println("Ошибка при создании карты");
            return null;
        } else {
            System.out.println("Карта создана!!");
            return "";
        }
    }

    /**
     * Метод для проверки PIN-кода.
     *
     * @param scanner         Сканер для ввода данных от пользователя.
     * @param numberCardInput Номер карты, который проверяется.
     * @return true, если PIN-код верен; false, если карта заблокирована.
     */
    private static boolean checkPIN(Scanner scanner, String numberCardInput) {
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Введите PIN-код: ");
            String enteredPIN = scanner.nextLine();

            if (enteredPIN.equals(correctPIN)) {
                return true; // PIN-код верен
            } else {
                attempts++;
                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("Ваш PIN-код неверен. Осталось попыток: " + (MAX_ATTEMPTS - attempts));
                }
            }
        }

        cardStatusMap.put(numberCardInput, true); // Карта заблокирована
        return false; // Карта заблокирована
    }

    /**
     * Метод для проверки, заблокирована ли карта.
     *
     * @param numberCard Номер карты для проверки.
     * @return true, если карта заблокирована; false в противном случае.
     */
    public static boolean isCardBlocked(String numberCard) {
        return cardStatusMap.getOrDefault(numberCard, false);
    }
}
