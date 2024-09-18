package labs.Practice3part1;

import java.util.Scanner;

public class Theodolite {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Введите угол");
        double radiusSlope = in.nextDouble();

        System.out.println("Расстояние");
        double distance = in.nextDouble();

        double degrees = Math.toDegrees(radiusSlope);
        final double AREACICLE = 2 * Math.PI * degrees;

        double hight = degrees * distance;
        System.out.println("Высота равна" + hight);
        double length = Math.sqrt(Math.pow(hight, 2) + Math.pow(degrees, 2));
        double radius = AREACICLE / 2 * Math.PI;
        double areaSide = Math.PI * (Math.sqrt(Math.pow(radius, 2) + Math.pow(hight, 2)));
        System.out.println("Площадь боковйо поверхности" + areaSide);



    }
}
