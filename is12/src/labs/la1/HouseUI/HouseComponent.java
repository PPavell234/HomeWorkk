package labs.la1.HouseUI;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class HouseComponent extends JComponent {
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        //Draw
        House house = new House(150, 150, 150, 130);


        house.draw(g2);
    }
}