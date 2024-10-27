package labs.Practice4Part2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите месяц: ");
        String month = scanner.nextLine();

        System.out.print("Введите день: ");
        int day = scanner.nextInt();


        MyDate date = new MyDate(month, day);


        String season = date.getSeason();
        System.out.println("Время года: " + season);

        scanner.close();
    }

}
