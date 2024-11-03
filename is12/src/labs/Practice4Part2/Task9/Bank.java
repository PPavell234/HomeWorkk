package labs.Practice4Part2.Task9;

import java.io.FileWriter;
import java.io.IOException;

class Bank {
    public static final int MAX_ATTEMPTS = 3;
    public Cart currentCard; // Текущая карта в банкомате
    public String lastEnteredPassword;
    public boolean isBlocked = false;
    public int failedAttempts = 0;

    //  Добавляем метод insertCard, который принимает объект Cart
    public void insertCard(String cardNumber) {
        // Проверка номера карты (16 цифр)
        if (cardNumber.matches("\\d{16}")) {
            if (currentCard != null && cardNumber.equals(currentCard.numberCard)) { // Проверка на соответствие
                //  Используем существующую карту
                lastEnteredPassword = currentCard.password; // Сохраняем пароль
            } else {
                //  Создаем новый объект Cart, если введен новый номер
                Cart newCart = new Cart();
                newCart.createCart(cardNumber, newCart.password);
                currentCard = newCart;
            }
        } else {
            currentCard = null; // Неверный номер карты
        }
    }

    public boolean checkCredentials(String password) {
        if (currentCard != null && currentCard.password.equals(password)) {
            return true; // Пароль верный
        } else {
            failedAttempts++;
            if (failedAttempts >= MAX_ATTEMPTS) {
                isBlocked = true;
            }
            return false; // Пароль неверный
        }
    }

    public void savePasswordToFile(String filename) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(lastEnteredPassword);
            fileWriter.flush();
        } catch (IOException e) {
            System.err.println("Ошибка при записи пароля в файл: " + e.getMessage());
        }
    }
}
