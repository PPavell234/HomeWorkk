package labs.Practice4Part2;

import java.util.Scanner;


import java.util.Scanner;

public class QuadrilateralType2 {

    // Точность сравнения для вещественных чисел
    private static final double T = 0.0001;

    /**
     * Вычисляет длину отрезка между двумя точками с заданными координатами.
     *
     * @param x1 Координата X первой точки.
     * @param y1 Координата Y первой точки.
     * @param x2 Координата X второй точки.
     * @param y2 Координата Y второй точки.
     * @return Длина отрезка между двумя точками.
     */
    private static double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }


    /**
     * Проверяет, параллельны ли две линии, заданные четырьмя точками.
     *
     * @param x1 Координата X первой точки первой линии.
     * @param y1 Координата Y первой точки первой линии.
     * @param x2 Координата X второй точки первой линии.
     * @param y2 Координата Y второй точки первой линии.
     * @param x3 Координата X первой точки второй линии.
     * @param y3 Координата Y первой точки второй линии.
     * @param x4 Координата X второй точки второй линии.
     * @param y4 Координата Y второй точки второй линии.
     * @return true, если линии параллельны; в противном случае false.
     */
    private static boolean isParallel(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return (y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1);
    }

    /**
     * Проверяет, образуют ли четыре точки вырожденный четырехугольник.
     *
     * @param x1 Координата X первой точки.
     * @param y1 Координата Y первой точки.
     * @param x2 Координата X второй точки.
     * @param y2 Координата Y второй точки.
     * @param x3 Координата X третьей точки.
     * @param y3 Координата Y третьей точки.
     * @param x4 Координата X четвертой точки.
     * @param y4 Координата Y четвертой точки.
     * @return true, если точки образуют вырожденный четырехугольник; в противном случае false.
     */
    private static boolean isDegenerate(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // Проверяем наличие коллинеарных ( наборы точек, все из которых находятся на одной прямой) точек с помощью определителя
        double det1 = (y2 - y1) * (x3 - x1) - (y3 - y1) * (x2 - x1);
        double det2 = (y2 - y1) * (x4 - x1) - (y4 - y1) * (x2 - x1);
        double det3 = (y3 - y2) * (x4 - x2) - (y4 - y2) * (x3 - x2);

        return Math.abs(det1) < T || Math.abs(det2) < T || Math.abs(det3) < T ||
                (x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x1 == x4 && y1 == y4) ||
                (x2 == x3 && y2 == y3) || (x2 == x4 && y2 == y4) || (x3 == x4 && y3 == y4);
    }


    /**
     * Определяет, пересекаются ли два отрезка на плоскости.
     *
     * @param x1 Координата x начала первого отрезка
     * @param y1 Координата y начала первого отрезка
     * @param x2 Координата x конца первого отрезка
     * @param y2 Координата y конца первого отрезка
     * @param x3 Координата x начала второго отрезка
     * @param y3 Координата y начала второго отрезка
     * @param x4 Координата x конца второго отрезка
     * @param y4 Координата y конца второго отрезка
     * @return true, если отрезки пересекаются; false - в противном случае
     */

    private static boolean isIntersect(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // Функция для определения ориентации точки относительно прямой

        // Проверяем все возможные пересечения сторон
        int o1 = orientation(x1, y1, x2, y2, x3, y3);
        int o2 = orientation(x1, y1, x2, y2, x4, y4);
        int o3 = orientation(x3, y3, x4, y4, x1, y1);
        int o4 = orientation(x3, y3, x4, y4, x2, y2);

        // Если ориентации разные, то отрезки пересекаются
        return (o1 != o2 && o3 != o4);
    }

    /**
     * Определяет ориентацию точки относительно прямой, заданной двумя другими точками.
     *
     * @param x1 Координата x первой точки прямой
     * @param y1 Координата y первой точки прямой
     * @param x2 Координата x второй точки прямой
     * @param y2 Координата y второй точки прямой
     * @param x3 Координата x точки, для которой определяется ориентация
     * @param y3 Координата y точки, для которой определяется ориентация
     * @return 0, если точки коллинеарны; 1, если точка лежит справа от прямой;
     * 2, если точка лежит слева от прямой
     */
    private static int orientation(int x1, int y1, int x2, int y2, int x3, int y3) {
        int val = (y2 - y1) * (x3 - x2) - (x2 - x1) * (y3 - y2);
        if (val == 0) return 0; // Коллинеарны
        return (val > 0) ? 1 : 2; // 1 - по часовой стрелке, 2 - против часовой стрелки
    }

    /**
     * Метод, который запускает программу и обрабатывает ввод координат точек.
     *
     * @param args Аргументы командной строки (не используются).
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


        if (isDegenerate(x1, y1, x2, y2, x3, y3, x4, y4) || isIntersect(x1, y1, x2, y2, x3, y3, x4, y4)) {
            System.out.println("Ошибка: Введенные точки образуют вырожденный или самопересекающийся четырехугольник!");
            return;
        }


        double ab = length(x1, y1, x2, y2);
        double bc = length(x2, y2, x3, y3);
        double ac = length(x1, y1, x3, y3);
        double bd = length(x2, y2, x4, y4);

        if (!isParallel(x1, y1, x2, y2, x3, y3, x4, y4) && !isParallel(x2, y2, x3, y3, x1, y1, x4, y4)) {
            System.out.println("Произвольный четырехугольник");
        } else if ((isParallel(x1, y1, x2, y2, x3, y3, x4, y4) && !isParallel(x2, y2, x3, y3, x1, y1, x4, y4)) ||
                (!isParallel(x1, y1, x2, y2, x3, y3, x4, y4) && isParallel(x2, y2, x3, y3, x1, y1, x4, y4))) {
            System.out.println("Трапеция");
        } else if (isParallel(x1, y1, x2, y2, x3, y3, x4, y4) && isParallel(x2, y2, x3, y3, x1, y1, x4, y4)) {
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