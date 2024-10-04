package labs.Practice4Part1;

public class Task8 {
    final private double N = 0;
    final private double E = 90;
    final private double S = 180;
    final private double W = 270;

    public String composDirection(double direcction) {
     /*   if (direcction == N) {
            return "Направление находится на N";
        }
        if (direcction >= N && direcction <= E) {
            return "Направление компаса находится на NE";
        } else if (direcction >= N && direcction <= S) {
            return "Направление компаса на ES";
        } else if (direcction >= S && direcction <= W) {
            return "Направление компаса на SW";
        } else if (direcction >= W && direcction <= N) {
            return ("Направление компаса на WN");
        }
        return direcction + "";*/

        if (340.0 >= direcction & direcction <= 20.0) {
            return "Направление находится на N Угол равен от начала " + direcction;
        } else if (20.0 <= direcction & direcction <= 70.0)
            return "Направление находится на NE Угол равен от начала " + direcction;
        else if (70.0 <= direcction & direcction <= 110.0) {
            return "Направление находится на E Угол равен от начала " + direcction;

        } else if (110.0 <= direcction & direcction <= 160.0) {
            return "Направление находится на ES Угол равен от начала " + direcction;

        } else if (160.0 <= direcction & direcction <= 200.0) {
            return "Направление находится на Угол равен от начала " + direcction;

        } else if (200.0 <= direcction & direcction <= 250.0) {
            return "Направление находится на SW Угол равен от начала " + direcction;

        } else if (250.0 <= direcction & direcction <= 290.0) {
            return "Направление находится на W Угол равен от начала " + direcction;
        } else if (290.0 <= direcction & direcction <= 340.0) {
            return "Направление находится на WN Угол равен от начала " + direcction;

        }

        return null;


    }

    public static void main(String[] args) {
        Task8 task8 = new Task8();
        System.out.println(task8.composDirection(10));
        System.out.println(task8.composDirection(240));
        System.out.println(task8.composDirection(90));
        System.out.println(task8.composDirection(180));
        System.out.println(task8.composDirection(310));


    }
}
