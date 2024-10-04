package labs.Practice4Part1;

import java.util.Scanner;

public class Task12 {

    private String line1;
    private String line2;
    private String line3;


    public void linePrnt() {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Напиши 1 слово");
        line1 = sc.nextLine();
        System.out.println("Напиши 2 слово");
        line2 = sc.nextLine();
        System.out.println("Напиши 3 слово");
        line3 = sc.nextLine();

        System.out.println(line1 + " " + line2 + " " + line3);


    }

    public static void main(String[] args) {

        Task12 t = new Task12();
        t.linePrnt();

    }


}
