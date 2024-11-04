package labs.Practice4Part2;

import java.util.Scanner;


public class QuadrilateralType {

    // Точность сравнения для вещественных чисел
    private static final double T = 0.0001;

    /**
     * Метод для вычисления длины отрезка между двумя точками.
     *
     * @param x1 координата X первой точки
     * @param y1 координата Y первой точки
     * @param x2 координата X второй точки
     * @param y2 координата Y второй точки
     * @return длина отрезка
     */
    private static double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    /**
     * Метод для проверки параллельности двух отрезков.
     *
     * @param x1 координата X первой точки первого отрезка
     * @param y1 координата Y первой точки первого отрезка
     * @param x2 координата X второй точки первого отрезка
     * @param y2 координата Y второй точки первого отрезка
     * @param x3 координата X первой точки второго отрезка
     * @param y3 координата Y первой точки второго отрезка
     * @param x4 координата X второй точки второго отрезка
     * @param y4 координата Y второй точки второго отрезка
     * @return true, если отрезки параллельны, иначе false
     */
    private static boolean isParallel(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return (y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1);
    }

    /**
     * Главный метод программы, который запрашивает у пользователя координаты четырех точек
     * и определяет тип четырехугольника.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите последовательно координаты 4-х точек:");
        System.out.print("A: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("B: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("C: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        System.out.print("D: ");
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        double ab = length(x1, y1, x2, y2);
        double bc = length(x2, y2, x3, y3);
        double cd = length(x3, y3, x4, y4);
        double da = length(x4, y4, x1, y1);
        double ac = length(x1, y1, x3, y3);
        double bd = length(x2, y2, x4, y4);

        // Проверка на произвольный четырехугольник
        if (!isParallel(x1, y1, x2, y2, x3, y3, x4, y4) && !isParallel(x2, y2, x3, y3, x1, y1, x4, y4)) {
            System.out.println("Произвольный четырехугольник");
        }
        // Проверка на трапецию
        else if ((isParallel(x1, y1, x2, y2, x3, y3, x4, y4) && !isParallel(x2, y2, x3, y3, x1, y1, x4, y4)) ||
                (!isParallel(x1, y1, x2, y2, x3, y3, x4, y4) && isParallel(x2, y2, x3, y3, x1, y1, x4, y4))) {
            System.out.println("Трапеция");
        }
        // Проверка на параллелограмм, прямоугольник, ромб и квадрат
        else if (isParallel(x1, y1, x2, y2, x3, y3, x4, y4) && isParallel(x2, y2, x3, y3, x1, y1, x4, y4)) {
            if (Math.abs(ab - bc) > T && Math.abs(ac - bd) > T) {
                System.out.println("Параллелограмм");
            } else if (Math.abs(ab - bc) > T && Math.abs(ac - bd) < T) {
                System.out.println("Прямоугольник");
            } else if (Math.abs(ab - bc) < T && Math.abs(ac - bd) > T) {
                System.out.println("Ромб");
            } else if (Math.abs(ab - bc) < T && Math.abs(ac - bd) < T) {
                System.out.println("Квадрат");
            }
        }

        scanner.close();
    }
}