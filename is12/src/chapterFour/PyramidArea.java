package chapterFour;

import java.util.Scanner;

import static java.lang.Math.*;

public class PyramidArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Первый объем");
        System.out.println("Введите радису r1,r2");
        double r1 = input.nextDouble();
        double r2 = input.nextDouble();
        System.out.println("Выстоту : ");
        double h1 = input.nextDouble();


        double areaOne = PI * ((Math.pow(r1, 2) + (r1 * r2) + Math.pow(r2, 2) * h1) / 3);

        System.out.println("Второй объем");
        System.out.println("Введите радису r3");
        double r3 = input.nextDouble();
        System.out.println("Выстоту : ");
        double h2 = input.nextDouble();


        double areaTwo = PI * ((Math.pow(r2, 2) + (r2 * r3) + Math.pow(r3, 2) * h2) / 3);


        System.out.println("Третий объем");
        System.out.println("Введите радису r4");
        double r4 = input.nextDouble();
        System.out.println("Выстоту : ");
        double h3 = input.nextDouble();


        double areaThree = PI * ((Math.pow(r3, 2) + (r3 * r4) + Math.pow(r4, 2) * h3) / 3);

        double total = areaOne + areaTwo + areaThree;


        System.out.printf("Объем %.0f", total);
    }

}
