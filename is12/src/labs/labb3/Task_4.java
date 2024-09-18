package labs.labb3;

import java.text.DecimalFormat;

import static java.lang.Math.*;
import static labs.labb3.Task_2.ctg;

public class Task_4 {
    public static void main(String[] args) {
        double a = 3.0;

        DecimalFormat df = new DecimalFormat("#.#####");
        double z1 = (((sin(4 * a)) / (1 + cos(4 * a))) * ((cos(2 * a)) / (1 + cos(2 * a))));
        double z2 = ctg(((3.0/ 2) * PI) - a);

        System.out.println(df.format(z1) + " " + df.format(z2));
    }
}
