package labs.la1;

import java.util.Scanner;

public class labs2t {
    public static void main(String[] args) {
        Scanner inpunt = new Scanner(System.in);

        System.out.println("Введите R");
        double radius = inpunt.nextDouble();

        double y = 0;
        for (; ; ) {
            System.out.println("Введите x");
            double x = inpunt.nextDouble();


            if (x >= -4 && x <= -3) {
                y = x + 3.0;
            } else if (x >= -3 && x <= -2) {
                y = x + 3.0;
            } else if (x >= -2 && x <= 0) {
                y = -(radius / 4.0) * x;
            } else if (x >= 0 && x <= 4) {
                y = -(radius / 4.0) * x;
            } else if (x >= 4 && x <= 6) {
                y = -2.0;
            } else if (x >= -2 && x <= 10) {
                y = Math.sqrt(Math.pow(radius,2.0) - Math.pow(x - 8.0, 2.0))-2.0;
            } else {
                y = Double.MIN_VALUE;
            }
            System.out.println("y=" + ((y == Double.MIN_VALUE) ? "Не определен" : y));


        }
    }
}
