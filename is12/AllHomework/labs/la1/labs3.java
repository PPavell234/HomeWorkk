package labs.la1;

import java.util.Scanner;

public class labs3 {
    public static void main(String[] args) {
        Scanner inpunt = new Scanner(System.in);

        System.out.println("Введите R");
        double radius = inpunt.nextDouble();

        double y = 0;
        for (; ; ) {
            System.out.println("Введите x");
            double x = inpunt.nextDouble();


            if (x >= -6 && x <= -4) {
                y = 2.0;
            } else if (x >= -4 && x <= 0) {
                y = -(6.0 / 12.0);
            } else if (x >= 0 && x <= 2) {
                y = -(3.0 / 6.0) * x;
            } else if (x >= -10 && x <= -6) {
                y = Math.sqrt(4.0 - (x + 8.0) * (x + 8.0)) + 2.0;
            } else if (x >= 2 && x <= 3) {
                y = (1.0 * x) - 3.0;
            } else if (x >= 3 && x <= 4) {
                y = (1.0 * x) - 3.0;
            } else {
                y = Double.MIN_VALUE;
            }
            System.out.println("y=" + ((y == Double.MIN_VALUE) ? "Не определен" : y));


        }
    }
}
