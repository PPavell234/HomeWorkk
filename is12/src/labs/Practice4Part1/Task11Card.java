package labs.Practice4Part1;

import java.util.Objects;

public class Task11Card {

    private String cardName;
    private String cardName2;
    private boolean isValid;


    /**
     * Конструктор класса Task11Card.
     *
     * @param cardName  Основное имя карты.
     * @param cardName2 Дополнительное имя карты.
     */

    public Task11Card(String cardName, String cardName2) {
        createCard(cardName, cardName2);
    }


    /**
     * Метод для создания карты с проверкой условий.
     *
     * @param cardName  Основное имя карты.
     * @param cardName2 Дополнительное имя карты.
     */
    private void createCard(String cardName, String cardName2) {
        if (isNumber(cardName2)) {
            isValid = false;
            return;
        }
        if (Objects.equals(cardName, cardName2)) {
            isValid = false;
            return;
        }

        this.cardName2 = convertCardName(cardName2);
        this.cardName = convertCardName(cardName);
        isValid = true;
    }

    /**
     * Проверяет, является ли строка числом.
     *
     * @param cardName Строка, которую нужно проверить.
     * @return true, если строка является числом; иначе false.
     */

    private boolean isNumber(String cardName) {
        try {
            Integer.parseInt(cardName);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Проверяет, является ли имя карты числом и находится ли оно в диапазоне от 1 до 10.
     *
     * @param cardName Строка, которую нужно проверить.
     * @return Строка с числом, если оно в диапазоне; иначе сообщение об ошибке.
     */
    private boolean isCardNameNumber(String cardName) {
        if (isNumber(cardName)) {
            int number = Integer.parseInt(cardName);
            if (number >= 1 && number <= 10) {
                return true;
            }
        }
        return false;
    }


    /**
     * Преобразует имя карты в более понятный формат.
     *
     * @param cardName Имя карты.
     * @return Преобразованное имя карты.
     */
    private String convertCardName(String cardName) {
        if (isCardNameNumber(cardName)) {
            return cardName;
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
                return "Такой карты не существует";
        }

    }

    /**
     * Получает описание карты в формате "Основное имя карты of Дополнительное имя карты".
     *
     * @return Описание карты.
     */
    public String getDescription() {
        if (!isValid) {
            return "Ошибка: карта не была создана из-за некорректных имен .";
        }
        return cardName + " of " + cardName2;
    }


    public static void main(String[] args) {
        Task11Card card1 = new Task11Card("A", "H");
        Task11Card card2 = new Task11Card("9", "A");
        Task11Card card3 = new Task11Card("11", "A");
        Task11Card card4 = new Task11Card("A", "A");
        Task11Card card5 = new Task11Card("A", "11");
        System.out.println(card1.getDescription());
        System.out.println(card2.getDescription());
        System.out.println(card3.getDescription());
        System.out.println(card4.getDescription());
        System.out.println(card5.getDescription());


    }
}

//Метод для получения названия выбранной карты












