package labs.la1.CockUI;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;



public class Cock {
    private final int xLeft;
    private final int yTop;
    private final int width;
    private final int height;

    /**
     * Constructs a house object with given position and size
     *
     * @param xPosition X-coordinate
     * @param yPosition Y-coordinate
     * @param width     Width of cock
     * @param height    Height of Cock
     */
    public Cock(int xPosition, int yPosition, int width, int height) {
        this.xLeft = xPosition;
        this.yTop = yPosition;
        this.width = width;
        this.height = height;
    }

    /**
     * Draws the Cock
     *
     * @param g2 the Graphics content
     */
    public void draw(Graphics2D g2) {


        //Голова
        Ellipse2D head = new Ellipse2D.Double(xLeft, yTop, width, height);
        //Гребешок
        Ellipse2D.Double scallop = new Ellipse2D.Double(xLeft + (width / 10.0), yTop - 5 * (height / 10.0), width / 2.0, height / 2.0);
        Ellipse2D.Double scallop2 = new Ellipse2D.Double(xLeft + (width / -2.9), yTop - 2 * (height / 10.0), width / 2.0, height / 2.0);
        Ellipse2D.Double scallop3 = new Ellipse2D.Double(xLeft + (width / -2.0), yTop + 3 * (height / 10.4), width / 2.0, height / 2.0);
        //Глаз
        Ellipse2D.Double eye = new Ellipse2D.Double(xLeft + (width / 2.1), yTop - 2 * (height / -9.0), width / 3.0, height / 3.0);
        Ellipse2D.Double eye2 = new Ellipse2D.Double(xLeft + (width / 1.9), yTop - 2.5 * (height / -9.0), width / 4.5, height / 4.5);
        //Клюв
        Line2D.Double beak = new Line2D.Double(xLeft+190, yTop-1, 300, 200);
        Line2D.Double beak2 = new Line2D.Double(xLeft+190, yTop+130, 300, 230);
        Line2D.Double beak3 = new Line2D.Double(xLeft+190, yTop-1, 320, 210);
        Line2D.Double beak4 = new Line2D.Double(xLeft+190, yTop+130, 320, 210);

        //Рисуем форму

        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(2));
        g2.draw(head);
        g2.draw(scallop);
        g2.draw(scallop2);
        g2.draw(scallop3);
        g2.draw(eye);
        g2.setColor(Color.black);
        g2.fill(eye2);
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(3));
        g2.draw(beak);
        g2.draw(beak2);
        g2.draw(beak3);
        g2.draw(beak4);



    }

}

