package labs.la1;

import java.util.Scanner;

public class labs1 {
    public static void main(String[] args) {
        Scanner inpunt = new Scanner(System.in);

        System.out.println("Введите R");
        double radius = inpunt.nextDouble();

        double y = 0;
        for (; ; ) {
            System.out.println("Введите x");
            double x = inpunt.nextDouble();


            if (x >= 9 && x < -6) {
                y = (10.0 + Math.sqrt(100.0 - 4.0 * x * x)) / 2.0;
            } else if (x >= -6 && x < -3) {
                y = x + 3.0;
            } else if (x >= -3 && x <= 0) {
                y = Math.sqrt(9.0 - Math.pow(x - 0, 2.0));
            } else if (x >= 0 && x <= 3) {
                y = -x + 3.0;
            } else if (x >= 3 && x < 9) {
                y = (2.0 / 4.0) * x - 1.5;
            } else if (x >= -9.0 && x <= -6) {
                y = Math.sqrt(4.0 - Math.pow(x - 8.0, 2.0));
            } else {
                y = Double.MIN_VALUE;
            }
            System.out.println("y=" + ((y == Double.MIN_VALUE) ? "Не определен" : y));


        }
    }
}
