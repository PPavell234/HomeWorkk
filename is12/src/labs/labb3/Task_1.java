package labs.labb3;

import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Task_1 {
    public static void main(String[] args) {
        double a = 4.0;
        double b = 2.0;

        DecimalFormat df = new DecimalFormat("#.#####");


        double z1 = ((pow(cos(a) - cos(b), 2)) - (pow(sin(a) - sin(b), 2)));
        double z2 = (((-4.0 * pow(sin((a - b) / 2), 2))) * (cos(a + b)));


        System.out.println(df.format(z1) + " " + df.format(z2));



    }
}
