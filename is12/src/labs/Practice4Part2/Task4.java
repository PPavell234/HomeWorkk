package labs.Practice4Part2;

import java.util.Scanner;

public class Task4 {

    private double pointOneX;
    private double pointOneY;
    private double pointTwoX;
    private double pointTwoY;
    private double pointThreeX;
    private double pointThreeY;
    private double pointFourX;
    private double pointFourY;

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

    private void determineFigure() {
        // Проверка на квадрат
        if (isSquare()) {
            System.out.println("Фигура: Квадрат");
        } else {
            // Проверка на прямоугольник
            if (isRectangle()) {
                System.out.println("Фигура: Прямоугольник");
            } else {
                // Проверка на трапецию
                if (isTrapezoid()) {
                    System.out.println("Фигура: Трапеция");
                } else {
                    // Проверка на параллелограмм
                    if (isParallelogram()) {
                        System.out.println("Фигура: Параллелограмм");
                    } else {
                        // Проверка на треугольник (используя только три точки, одна из точек должна быть 0 0)
                        if (isTriangle()) {
                            System.out.println("Фигура: Треугольник");
                        } else {
                            System.out.println("Фигура: Неизвестная");
                        }
                    }
                }
            }
        }
    }

    private boolean isSquare() {
        // Проверка на равные стороны и прямые углы
        double side1 = calculateDistance(pointOneX, pointOneY, pointTwoX, pointTwoY);
        double side2 = calculateDistance(pointTwoX, pointTwoY, pointThreeX, pointThreeY);
        double side3 = calculateDistance(pointThreeX, pointThreeY, pointFourX, pointFourY);
        double side4 = calculateDistance(pointFourX, pointFourY, pointOneX, pointOneY);

        // Проверка на равенство диагоналей
        double diagonal1 = calculateDistance(pointOneX, pointOneY, pointThreeX, pointThreeY);
        double diagonal2 = calculateDistance(pointTwoX, pointTwoY, pointFourX, pointFourY);

        if (side1 == side2 && side1 == side3 && side1 == side4 &&
                isRightAngle(pointOneX, pointOneY, pointTwoX, pointTwoY, pointThreeX, pointThreeY) &&
                isRightAngle(pointTwoX, pointTwoY, pointThreeX, pointThreeY, pointFourX, pointFourY) &&
                isRightAngle(pointThreeX, pointThreeY, pointFourX, pointFourY, pointOneX, pointOneY) &&
                isRightAngle(pointFourX, pointFourY, pointOneX, pointOneY, pointTwoX, pointTwoY) &&
                diagonal1 == diagonal2) {
            return true;
        }
        return false;
    }

    private boolean isRectangle() {
        // Проверка на равные стороны и прямые углы
        double side1 = calculateDistance(pointOneX, pointOneY, pointTwoX, pointTwoY);
        double side2 = calculateDistance(pointTwoX, pointTwoY, pointThreeX, pointThreeY);
        double side3 = calculateDistance(pointThreeX, pointThreeY, pointFourX, pointFourY);
        double side4 = calculateDistance(pointFourX, pointFourY, pointOneX, pointOneY);

        // Проверка на то, что две соседние стороны не равны
        if ((side1 != side2 && side3 == side4) ||
                (side1 == side2 && side3 != side4) ||
                (side1 != side4 && side2 == side3) ||
                (side1 == side4 && side2 != side3)) {

            // Проверка на прямые углы
            if (isRightAngle(pointOneX, pointOneY, pointTwoX, pointTwoY, pointThreeX, pointThreeY) &&
                    isRightAngle(pointTwoX, pointTwoY, pointThreeX, pointThreeY, pointFourX, pointFourY) &&
                    isRightAngle(pointThreeX, pointThreeY, pointFourX, pointFourY, pointOneX, pointOneY) &&
                    isRightAngle(pointFourX, pointFourY, pointOneX, pointOneY, pointTwoX, pointTwoY)) {
                return true;
            }
        }

        return false;
    }

    private boolean isTrapezoid() {
        // Проверка на параллельные стороны
        double side1 = calculateDistance(pointOneX, pointOneY, pointTwoX, pointTwoY);
        double side2 = calculateDistance(pointTwoX, pointTwoY, pointThreeX, pointThreeY);
        double side3 = calculateDistance(pointThreeX, pointThreeY, pointFourX, pointFourY);
        double side4 = calculateDistance(pointFourX, pointFourY, pointOneX, pointOneY);

        // Проверка на параллельность
        double slope12 = calculateSlope(pointOneX, pointOneY, pointTwoX, pointTwoY);
        double slope34 = calculateSlope(pointThreeX, pointThreeY, pointFourX, pointFourY);
        if ((slope12 == slope34 && side1 != side3) || (slope12 == slope34 && side2 != side4)) {
            return true;
        }
        return false;
    }

    private boolean isParallelogram() {
        // Проверка на параллельные стороны
        double side1 = calculateDistance(pointOneX, pointOneY, pointTwoX, pointTwoY);
        double side2 = calculateDistance(pointTwoX, pointTwoY, pointThreeX, pointThreeY);
        double side3 = calculateDistance(pointThreeX, pointThreeY, pointFourX, pointFourY);
        double side4 = calculateDistance(pointFourX, pointFourY, pointOneX, pointOneY);

        // Проверка на параллельность
        double slope12 = calculateSlope(pointOneX, pointOneY, pointTwoX, pointTwoY);
        double slope34 = calculateSlope(pointThreeX, pointThreeY, pointFourX, pointFourY);
        double slope23 = calculateSlope(pointTwoX, pointTwoY, pointThreeX, pointThreeY);
        double slope41 = calculateSlope(pointFourX, pointFourY, pointOneX, pointOneY);
        if ((slope12 == slope34 && side1 == side3 && slope23 == slope41 && side2 == side4)) {
            return true;
        }
        return false;
    }

    private double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private double calculateSlope(double x1, double y1, double x2, double y2) {
        if (x2 - x1 == 0) {
            return Double.POSITIVE_INFINITY; // Вертикальная линия
        } else {
            return (y2 - y1) / (x2 - x1);
        }
    }

    private boolean isRightAngle(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Проверка на прямоугольный треугольник по теореме Пифагора
        double side1 = calculateDistance(x1, y1, x2, y2);
        double side2 = calculateDistance(x2, y2, x3, y3);
        double side3 = calculateDistance(x3, y3, x1, y1);
        double maxSide = Math.max(Math.max(side1, side2), side3);
        if (Math.pow(maxSide, 2) == Math.pow(side1, 2) + Math.pow(side2, 2) ||
                Math.pow(maxSide, 2) == Math.pow(side2, 2) + Math.pow(side3, 2) ||
                Math.pow(maxSide, 2) == Math.pow(side1, 2) + Math.pow(side3, 2)) {
            return true;
        }
        return false;
    }

    // Проверка на треугольник (используя только три точки)
    private boolean isTriangle() {
        // Проверка, что все точки разные
        if (pointOneX == pointTwoX && pointOneY == pointTwoY ||
                pointOneX == pointThreeX && pointOneY == pointThreeY ||
                pointTwoX == pointThreeX && pointTwoY == pointThreeY) {
            return false;
        }
        return true;
    }

    //Запуск программы
    public static void main(String[] args) {
        Task4 task = new Task4();
        task.buildGraph();



    }
}