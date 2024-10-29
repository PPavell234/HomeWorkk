package labs.Practice4Part1;

public class task2 {
    private int hours;
    private int minutes;

    /**
     * Конструктор, который создает объект task1 из строки.
     *
     * @param time строка времени в формате "HH:MM"
     * @throws IllegalArgumentException если строка не соответствует формату или содержит недопустимые значения
     */
    public task2(String time) {
        String[] parts = time.split(":");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Неверный формат времени. Должен быть HH:MM");
        }

        try {
            this.hours = Integer.parseInt(parts[0]);
            this.minutes = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат времени. Должен быть HH:MM");
        }

        // Проверка корректности часов
        if (this.hours < 0 || this.hours > 23) {
            throw new IllegalArgumentException("Некорректные часы. Должны быть от 0 до 23");
        }

        // Проверка корректности минут
        if (this.minutes < 0 || this.minutes > 60) {
            throw new IllegalArgumentException("Некорректные минуты. Должны быть от 0 до 60");
        }
    }

    /**
     * Преобразует время в общее количество минут с начала суток.
     *
     * @return общее количество минут
     */
    private int toMinutes() {
        return hours * 60 + minutes;
    }

    /**
     * Форматирует время в строковом представлении "HH:MM".
     *
     * @return строка, представляющая время в формате "HH:MM"
     */
    private String format() {
        return String.format("%02d:%02d", hours, minutes);
    }


    /**
     * Сравнивает два времени и возвращает строку с описанием результата сравнения.
     *
     * @param t1 первое время для сравнения
     * @param t2 второе время для сравнения
     * @return строка, описывающая результат сравнения времнеи
     */

    public static String compareTimes(task2 t1, task2 t2) {
        if (t1.toMinutes() == t2.toMinutes()) {
            return "Время пересекается ";
        } else {
            if (t1.toMinutes() > t2.toMinutes()) {
                return "Время не пересекается сначало наступило " + t2.format() + " после этого " + t1.format();
            } else {
                return "Время не пересекается сначало наступило " + t1.format() + " после этого " + t2.format();

            }
        }
    }


    public static void main(String[] args) {

        task2 time1 = new task2("12:60");
        task2 time2 = new task2("16:30");
        task2 time3 = new task2("18:30");
        task2 time4 = new task2("16:30");


        System.out.println(compareTimes(time1, time2));
        System.out.println(compareTimes(time2, time4));
        System.out.println(compareTimes(time2, time3));

    }
}



