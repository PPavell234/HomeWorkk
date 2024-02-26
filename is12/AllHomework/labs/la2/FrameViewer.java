package labs.la2;

import java.awt.*;


import javax.swing.*;

public class FrameViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        ImageIcon originalIcon = new ImageIcon("src/labs/la2/images/pich.png");
        Image image = originalIcon.getImage();
        Image scaledImage = image.getScaledInstance(10, 10, Image.SCALE_SMOOTH);

        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel label = new JLabel("Привет, Павел!", scaledIcon, JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);

        label.setOpaque(true);
        Color myColor = new Color(151, 252, 151);
        label.setBackground(myColor);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}