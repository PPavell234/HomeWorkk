package labs.la2;

import java.awt.*;

public class FourRectanglePrinter {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(10, 20, 50, 70);
        System.out.println(box1); //creates first and base rectangle

        box1.translate(50, 0);
        System.out.println(box1); //creates the second

        box1.translate(0, 70);
        System.out.println(box1);//creates the third

        box1.translate(-50, 0);
        System.out.println(box1);//creates the fourth

    }
}
