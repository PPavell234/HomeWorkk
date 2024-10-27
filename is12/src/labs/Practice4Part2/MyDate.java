package labs.Practice4Part2;

class MyDate {
    private String month;
    private int day;


    /**
     * Конструктор класса MyDate.
     *
     * @param month название месяца (например, "January", "February" и т.д.)
     * @param day   день месяца (должен быть больше 0)
     */
    public MyDate(String month, int day) {
        this.month = month;
        this.day = day;
    }

    /**
     * Метод getSeason определяет время года на основе введенной даты.
     * Также проверяет корректность даты и возвращает соответствующее сообщение
     * об ошибке, если дата некорректна.
     *
     * @return строку, представляющую время года ("Winter", "Spring", "Summer", "Autumn")
     * или сообщение об ошибке, если дата некорректна.
     */
    public String getSeason() {
        if (day < 1) {
            return "Некорректная дата. День должен быть больше 0.";
        }

        switch (month.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                if (day > 31) {
                    return "Некорректная дата. В этом месяце максимум 31 день.";
                }
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                if (day > 30) {
                    return "Некорректная дата. В этом месяце максимум 30 дней.";
                }
                break;
            case "february":
                if (day > 29) { // Для простоты не учитываем високосные года
                    return "Некорректная дата. В феврале максимум 29 дней.";
                }
                break;
            default:
                return "Некорректный месяц.";
        }

        // Если дата корректна, определяем время года
        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                return "Winter";
            case "march":
            case "april":
            case "may":
                return "Spring";
            case "june":
            case "july":
            case "august":
                return "Summer";
            case "september":
            case "october":
            case "november":
                return "Autumn";
            default:
                return "Некорректный месяц.";
        }
    }
}
