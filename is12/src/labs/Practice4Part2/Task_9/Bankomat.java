package labs.Practice4Part2.Task_9;

import java.util.Scanner;


public class Bankomat {

    private static final int MAX_ATTEMPTS = 3; // Максимальное количество попыток ввода PIN-кода
    private static String correctPIN; // Правильный PIN-код для карты
    private static String numberCard; // Номер карты

    /**
     * Главный метод программы. Создает карты и обрабатывает ввод пользователя.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Примеры создания карт
        String card1 = createCart("3456435345543553", "3456"); // Корректная карта
        System.out.println(card1);
        String card2 = createCart("4567433567865434", "3457"); // Некорректная карта

        // Вставка карт
        insertCard("3456435345543553");
        insertCard("4567433567865434");

        scanner.close();
    }

    /**
     * Метод для вставки карты.
     *
     * @param numberCardInput Номер карты, который вводит пользователь.
     * @return Сообщение о результате операции.
     */
    public static String insertCard(String numberCardInput) {
        if (numberCardInput.equals(numberCard)) {
            Scanner scanner = new Scanner(System.in);
            if (checkPIN(scanner)) {
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
        Bankomat.numberCard = numberCard;

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
     * @param scanner Сканер для ввода данных от пользователя.
     * @return true, если PIN-код верен; false, если карта заблокирована.
     */
    private static boolean checkPIN(Scanner scanner) {
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

        return false; // Карта заблокирована
    }
}