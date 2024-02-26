package labs.la2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IconExample {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("images/new.jpg");

        // Создаем новый объект JFrame
        JFrame frame = new JFrame();

        // Устанавливаем размеры окна
        frame.setSize(600, 400);

        // Создаем новый объект JLabel с изображением в качестве фона
        JLabel background = new JLabel(icon);

        // Устанавливаем размеры и положение JLabel так, чтобы оно занимало все пространство JFrame
        background.setBounds(0, 0, 600, 400);

        // Добавляем JLabel на JFrame с индексом слоя 0, чтобы он был ниже других компонентов
        frame.add(background, 0);

        // Устанавливаем операцию по умолчанию при закрытии окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Делаем окно видимым
        frame.setVisible(true);
    }
}
