package labs.Practice4Part1;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {

    private String line1;
    private String line2;
    private String line3;

    /**
     * Метод linePrnt считывает три строки от пользователя,
     * сортирует их и выводит отсортированные строки на экран.
     */
    public void linePrnt() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Напиши 1 слово");
        line1 = sc.nextLine();

        System.out.println("Напиши 2 слово");
        line2 = sc.nextLine();

        System.out.println("Напиши 3 слово");
        line3 = sc.nextLine();

        String[] lines = {line1, line2, line3};

        Arrays.sort(lines);

        System.out.println("Отсортированные слова:");
        for (String line : lines) {
            System.out.print(line + " ");
        }

        sc.close();
    }

    public static void main(String[] args) {
        Task12 t = new Task12();
        t.linePrnt();
    }
}



