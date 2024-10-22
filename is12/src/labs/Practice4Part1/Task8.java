package labs.Practice4Part1;

public class Task8 {
    final private double N = 0;
    final private double E = 90;
    final private double S = 180;
    final private double W = 270;


    /**
     * Метод composDirection определяет направление на основе заданного угла.
     *
     * <p>Метод принимает угол в градусах и возвращает строку, указывающую направление, * в котором находится угол. Углы делятся на 8 направлений: N, NE, E, ES, S, SW, W, WN.</p>
     *
     * @param direction угол в градусах (от 0 до 360)
     * @return строка с указанием направления и угла, или пустая строка, если угол не попадает в диапазон 0-360
     */

    public String composDirection(double direction) {
        if (340.0 >= direction & direction <= 20.0) {
            return "Направление находится на N Угол равен от начала " + direction;
        } else if (20.0 <= direction & direction <= 70.0)
            return "Направление находится на NE Угол равен от начала " + direction;
        else if (70.0 <= direction & direction <= 110.0) {
            return "Направление находится на E Угол равен от начала " + direction;

        } else if (110.0 <= direction & direction <= 160.0) {
            return "Направление находится на ES Угол равен от начала " + direction;

        } else if (160.0 <= direction & direction <= 200.0) {
            return "Направление находится на S Угол равен от начала " + direction;

        } else if (200.0 <= direction & direction <= 250.0) {
            return "Направление находится на SW Угол равен от начала " + direction;

        } else if (250.0 <= direction & direction <= 290.0) {
            return "Направление находится на W Угол равен от начала " + direction;
        } else if (290.0 <= direction & direction <= 340.0) {
            return "Направление находится на WN Угол равен от начала " + direction;

        }

        return " ";


    }

    public static void main(String[] args) {
        Task8 task8 = new Task8();
        System.out.println(task8.composDirection(0));
        System.out.println(task8.composDirection(240));
        System.out.println(task8.composDirection(90));
        System.out.println(task8.composDirection(180));
        System.out.println(task8.composDirection(310));


    }
}

