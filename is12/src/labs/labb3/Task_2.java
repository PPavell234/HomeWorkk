package labs.labb3;

import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Task_2 {
    public static void main(String[] args) {
        double a = 2.3;

        DecimalFormat df = new DecimalFormat("#.#####");

        double z1 = ((sin((PI / 2) + 3 * a)) / (1 - sin((3 * a) - PI)));
        double z2 = ctg(((5.0 / 4) * PI) + ((3.0 / 2) * a));


        System.out.println(df.format(z1) + " " + df.format(z2));
    }

    public static double ctg(double b) {
        return 1 / tan(b);
    }
}
