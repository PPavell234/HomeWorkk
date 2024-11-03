package labs.Practice4Part2.Task11;

import java.util.Scanner;

public class task4_2 {

    // Координаты вершин
    private double pointOneX;
    private double pointOneY;
    private double pointTwoX;
    private double pointTwoY;
    private double pointThreeX;
    private double pointThreeY;
    private double pointFourX;
    private double pointFourY;

    // Метод для ввода координат точек
    public void buildGraph() {
        Scanner sc = new Scanner(System.in);

        // Ввод координат точек
        System.out.println("Введите координаты первой точки (x y):");
        pointOneX = sc.nextDouble();
        pointOneY = sc.nextDouble();

        System.out.println("Введите координаты второй точки (x y):");
        pointTwoX = sc.nextDouble();
        pointTwoY = sc.nextDouble();

        System.out.println("Введите координаты третьей точки (x y):");
        pointThreeX = sc.nextDouble();
        pointThreeY = sc.nextDouble();

        System.out.println("Введите координаты четвертой точки (x y):");
        pointFourX = sc.nextDouble();
        pointFourY = sc.nextDouble();

        // Определение фигуры
        determineFigure();
    }

    // Метод для определения фигуры
    private void determineFigure() {
        double[] lengths = new double[4];
        lengths[0] = distance(pointOneX, pointOneY, pointTwoX, pointTwoY); // AB
        lengths[1] = distance(pointTwoX, pointTwoY, pointThreeX, pointThreeY); // BC
        lengths[2] = distance(pointThreeX, pointThreeY, pointFourX, pointFourY); // CD
        lengths[3] = distance(pointFourX, pointFourY, pointOneX, pointOneY); // DA

        // Проверка равенства сторон
        boolean allSidesEqual = (lengths[0] == lengths[1]) && (lengths[1] == lengths[2]) && (lengths[2] == lengths[3]);
        boolean isRectangle = (lengths[0] == lengths[2]) && (lengths[1] == lengths[3]);
        boolean isSquare = isRectangle && (lengths[0] == lengths[1]);
        boolean isRhombus = allSidesEqual;

        // Проверка перпендикулярности диагоналей
        boolean diagonalsIntersectPerpendicularly = (pointOneX - pointThreeX) * (pointTwoY - pointFourY) +
                (pointOneY - pointThreeY) * (pointTwoX - pointFourX) == 0;

        // Определение фигуры
        if (isSquare) {
            System.out.println("Фигура: Квадрат");
        } else if (isRectangle) {
            System.out.println("Фигура: Прямоугольник");
        } else if (isRhombus) {
            if (diagonalsIntersectPerpendicularly) {
                System.out.println("Фигура: Ромб");
            } else {
                System.out.println("Фигура: Ромб (но диагонали не перпендикулярны)");
            }
        } else {
            System.out.println("Фигура: Неизвестная");
        }
    }

    // Метод для вычисления расстояния между двумя точками
    private double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        task4_2 task4 = new task4_2();
        task4.buildGraph();
    }
}