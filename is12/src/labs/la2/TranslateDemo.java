package labs.la2;
import javax.swing.*;
import java.awt.*;

public class TranslateDemo {
    public static void main (String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        Rectangle box = new Rectangle(10, 10, 300, 400);
        frame.setBounds(box);

        JOptionPane.showMessageDialog(frame, "Click OK to continue");


        box.setLocation(1000, 500);
        frame.setBounds(box);

        JOptionPane.showMessageDialog(frame, "Click OK to continue");


    }
}

