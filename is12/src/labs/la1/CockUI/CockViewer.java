package labs.la1.CockUI;

import javax.swing.*;

public class CockViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(400, 400);
        frame.setTitle("Cock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CockComponent component = new CockComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
