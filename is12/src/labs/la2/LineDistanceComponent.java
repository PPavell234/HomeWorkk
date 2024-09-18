package labs.la2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LineDistanceComponent extends JComponent {

    public static void main(String[] args) {

    }


    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // экземпляр основного сегмента линии из двух точек
        Point2D.Double from = new Point2D.Double(100, 100);
        Point2D.Double to = new Point2D.Double(200, 200);

        Line2D.Double seg1 = new Line2D.Double(from, to);

        // Нарисуем отрезок линии
        g2.draw(seg1);

        // Создаем экземпляр 3 пункта
        Point2D.Double p1 = new Point2D.Double(100, 200);
        Point2D.Double p2 = new Point2D.Double(150, 150);
        Point2D.Double p3 = new Point2D.Double(250, 50);

        //Создаем объекты эллипса, чтобы рисовать маленькие точки.
        Ellipse2D.Double point1 = new Ellipse2D.Double(p1.getX(), p1.getY(), 5, 5);
        Ellipse2D.Double point2 = new Ellipse2D.Double(p2.getX(), p2.getY(), 5, 5);
        Ellipse2D.Double point3 = new Ellipse2D.Double(p3.getX(), p3.getY(), 5, 5);

        // Создаем экземпляр, но не устанавливайте значение расстояния от точки до линии
        int distance;

        // Устанавливаем цвет точек
        g2.setColor(Color.BLUE);

        // Заполняем 3 точки, найдите расстояние от точки до линии и напишите расстояние рядом с ней.
        g2.fill(point1);
        distance = (int) seg1.ptLineDist(p1);
        g2.drawString("Расстояние: " + distance, (int) p1.getX() - 30, (int) p1.getY() + 20);

        g2.fill(point2);
        distance = (int) seg1.ptLineDist(p2);
        g2.drawString("Расстояние: " + distance, (int) p2.getX() - 30, (int) p2.getY() + 20);

        g2.fill(point3);
        distance = (int) seg1.ptLineDist(p3);
        g2.drawString("Расстояние: " + distance, (int) p3.getX() - 30, (int) p3.getY() + 20);
    }


}



