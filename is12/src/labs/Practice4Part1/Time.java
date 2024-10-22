package labs.Practice4Part1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Time {
    private int hours;
    private int minutes;


    /**
     * Конструктор, который создает объект Time из строки.
     *
     * @param time строка времени в формате "HH:MM"
     * @throws NumberFormatException если строка не соответствует формату или содержит недопустимые значения
     */
    public Time(String time) {
        String[] parts = time.split(":");
        this.hours = Integer.parseInt(parts[0]);
        this.minutes = Integer.parseInt(parts[1]);
    }

    /**
     * Преобразует время в общее количество минут с начала суток.
     *
     * @return общее количество минут
     */
    public int toMinutes() {
        return hours * 60 + minutes;
    }

    /**
     * Форматирует время в строковом представлении "HH:MM".
     *
     * @return строка, представляющая время в формате "HH:MM"
     */

    public String format() {
        return String.format("%02d:%02d", hours, minutes);
    }

    /**
     * Сравнивает текущее время с другим временем.
     *
     * @param other другое время для сравнения
     * @return -1, если текущее время предшествует другому;
     * 0, если оба времени одинаковы; *          1, если текущее время позже другого
     */
    public int compareTo(Time other) {
        int thisTotalMinutes = this.toMinutes();
        int otherTotalMinutes = other.toMinutes();

        if (thisTotalMinutes < otherTotalMinutes) {
            return -1;
        } else if (thisTotalMinutes > otherTotalMinutes) {
            return 1;
        } else {
            return 0;
        }
    }
}

