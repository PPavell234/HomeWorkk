package labs.la2;

import javax.swing.*;

public class ColorNameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(800, 800);
        frame.setTitle("12 Цветов");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorNameComponent colName = new ColorNameComponent();
        frame.add(colName);

        frame.setVisible(true);
    }
}