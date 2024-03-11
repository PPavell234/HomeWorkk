package labs.la2;

import javax.swing.*;

public class DisplayImage {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("images/pich.png"); // Подставьте путь к вашему изображению
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}