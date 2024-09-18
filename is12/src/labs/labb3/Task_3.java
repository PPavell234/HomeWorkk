package labs.labb3;

import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Task_3 {
    public static void main(String[] args) {
        double a = 3.0;

        DecimalFormat df = new DecimalFormat("#.#####");

        double z1 = ((1 - 2 * pow(sin(a), 2)) / (1 + sin(2 * a)));
        double z2 = ((1 - tan(a)) / (1 + tan(a)));

        System.out.println(df.format(z1) + " " + df.format(z2));

    }
}
