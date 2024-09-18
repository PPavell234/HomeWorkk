package chapterFour;

import java.util.Scanner;

//Напишите программу, которая считывает число и отображает квадрат, куб и четвертую
//степень. Используйте метод Math.pow только для четвертой степени.
public class SquareCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextInt();
        double areaSquare = (a * a);
        System.out.println("Квадрат "+areaSquare);
        double areaСube = 6 * (a * a);
        System.out.println("Куб"+areaСube);
        double fourthDegree = Math.pow(a,4);
        System.out.println("Четвертая степень" + fourthDegree);


    }
}
