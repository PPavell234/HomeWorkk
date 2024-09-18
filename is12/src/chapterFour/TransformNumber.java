package chapterFour;

import java.util.Scanner;

public class TransformNumber {
    public static void main(String[] args) {
        String months = "Январь    Февраль   Март      Апрель    Май       Июнь      Июль      Август    Сентябрь  Октябрь   Ноябрь    Декабрь   ";

        for (int i = 1; ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите месяц: ");
            int monthNumber = sc.nextInt();

            int startIndex = (monthNumber - 1) * 10; // Начальный индекс для подстроки
            int endIndex = startIndex + 7; // Конечный индекс для подстроки (7 символов - длина каждого месяца)
            String monthName = months.substring(startIndex, endIndex).trim(); // trim() удаляет начальные и конечные пробелы из строки

            System.out.println(monthName);
        }
    }
}