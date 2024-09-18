package labs.la1.CockUI;

import javax.swing.*;
import java.awt.*;

public class CockComponent extends JComponent {
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        //Draw
        Cock house = new Cock(150, 150, 150, 130);




        house.draw(g2);
    }
}