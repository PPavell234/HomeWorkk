package labs.la2;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LineDistanceTester {
    public static void ptSegDist(){
        Point2D.Double p1 = new Point2D.Double(100, 100);
        Point2D.Double p2 = new Point2D.Double(200, 200);
        Line2D.Double l1 = new Line2D.Double(p1, p2);

        Point2D.Double p3 = new Point2D.Double(100, 200);
        System.out.println(l1.ptSegDist(p3));
        Point2D.Double p4 = new Point2D.Double(150, 150);
        System.out.println(l1.ptSegDist(p4));
        Point2D.Double p5 = new Point2D.Double(250, 50);
        System.out.println(l1.ptSegDist(p5));
    }

    public static void main(String[] args) {
        ptSegDist();
    }
}
