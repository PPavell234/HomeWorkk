package labs.Practice4Part1;

public class Task11Card {


    private String description;

    public Task11Card() {
    }

    //Конструктор для создания карт
    public Task11Card(String cardName) {
        if (cardName.equals("D")) {
            description = "Diamonds";
        } else if (cardName.equals("H")) {
            description = "Hearts";
        } else if (cardName.equals("S")) {
            description = "Spades";
        } else if (cardName.equals("C")) {
            description = "Clubs";
        } else {
            description = "Неизвестно";
        }


        // Проверка на числа от 1 до 10
        try {
            int number = Integer.parseInt(cardName);
            if (number >= 1 && number <= 10) {
                description = "Карта явяляется число";
            }
        } catch (NumberFormatException e) {
            // Игнорируем ошибку, если ввод не является числом
        }

    }

    //Метод для получения названия выбранной карты
    public String getDescription() {
        return description;
    }


    public static void main(String[] args) {
        Task11Card card = new Task11Card("10");

        System.out.println(card.getDescription());


    }

}









