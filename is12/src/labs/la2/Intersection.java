package labs.la2;

import java.awt.*;

public class Intersection {
    public static void main (String[] args)
    {
        Rectangle r1 = new Rectangle(10, 10, 50, 100);
        Rectangle r2 = new Rectangle(35, 60, 100, 50);
        Rectangle r4 = new Rectangle(200, 10, 10, 50);
        Rectangle r5 = new Rectangle(10, 10, 10, 50);



        System.out.println("Rectangle 1: " + r1);
        System.out.println("Rectangle 2: " + r2);



        Rectangle r3 = r1.intersection(r2);
        System.out.println("Rectangle 3: " + r3);

        boolean IntersectionOfRectangles = r1.intersects(r2);
        System.out.println("Пересекаются ? :" + IntersectionOfRectangles);

        System.out.println("Rectangle 4: " + r1);
        System.out.println("Rectangle 5: " + r2);



        Rectangle r6 = r1.intersection(r2);
        System.out.println("Rectangle 6: " + r6);

        IntersectionOfRectangles = r4.intersects(r5);
        System.out.println("Пересекаются ? :" + IntersectionOfRectangles);




    }
}
