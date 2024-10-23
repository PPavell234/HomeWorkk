package labs.Practice4Part1;

import java.util.Objects;

public class Task11Card {

    private String cardName;
    private String cardName2;

    public Task11Card(String cardName, String cardName2) {
        createCard(cardName, cardName2);
    }

    private void createCard(String cardName, String cardName2) {
        // Проверяем, является ли cardName2 числом
        if (isNumber(cardName2)) {
            System.out.println("Ошибка: имя_карты2 не может быть числом.");
            return; // Завершаем выполнение метода, если cardName2 - число }
        }
        if (Objects.equals(cardName, cardName2)) {
            System.out.println("Ошибка: cardName и cardName2 не могут быть одинаковыми.");
        }


        this.cardName2 = convertCardName(cardName2);
        this.cardName = convertCardName(cardName);

    }

    private boolean isNumber(String cardName) {
        try {
            Integer.parseInt(cardName);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private String isCardNameNumber(String cardName) {
        if (isNumber(cardName)) {
            int number = Integer.parseInt(cardName);
            if (number >= 1 && number <= 10) {
                return cardName;
            }
        }
        return "Число должно быть меньше 10 или равен";
    }

    private String convertCardName(String cardName) {
        if (isNumber(cardName)) {
            return isCardNameNumber(cardName); // Если это число, возвращаем его как строку
        }

        switch (cardName) {
            case "D":
                return "Diamonds";
            case "H":
                return "Hearts";
            case "S":
                return "Spades";
            case "C":
                return "Clubs";
            case "A":
                return "Ace";
            case "J":
                return "Jack";
            case "Q":
                return "Queen";
            case "K":
                return "King";
            default:
                return "Такой карты не существует"; // Возвращаем оригинальное значение, если это не масть
        }
    }

    private String checkIfNumber(String cardName) {
        try {
            int number = Integer.parseInt(cardName);
            if (number >= 1 && number <= 10) {
                return cardName;
            }

        } catch (NumberFormatException e) {
            // Возвращаем false, если ввод не является числом return false;
        }
        return "Eror";
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardName2() {
        return cardName2;
    }

    public String getDescription() {
        return cardName + " of " + cardName2;
    }

    // Конструктор для создания карт
    public static void main(String[] args) {
        Task11Card card1 = new Task11Card("J", "H");
        System.out.println(card1.getDescription());


    }
}

//Метод для получения названия выбранной карты












