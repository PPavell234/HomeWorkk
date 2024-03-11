package labs.la1;

import java.util.Scanner;

public class labs1t {
    public static void main(String[] args) {
        Scanner inpunt = new Scanner(System.in);

        System.out.println("Введите R");
        double radius = inpunt.nextDouble();

        double y = 0;
        for (; ; ) {
            System.out.println("Введите x");
            double x = inpunt.nextDouble();


            if (x >= -9 && x < -6) {
                y = -(Math.sqrt(Math.pow(radius,2.0)-Math.pow(x+6.0,2.0)));
            } else if (x >= -6 && x <= -3) {
                y = x + 3.0;
            } else if (x >= -3 && x <= 0) {
                y = Math.sqrt(Math.pow(radius,2) - Math.pow(x - 0, 2));
            } else if (x >= 0 && x <= 3) {
                y = -x + 3.0;
            } else if (x >= 3 && x < 9) {
                y = (radius / 4.0) * x - 1.5;
            } else {
                y = Double.MIN_VALUE;
            }
            System.out.println("y=" + ((y == Double.MIN_VALUE) ? "Не определен" : y));


        }
    }
}
