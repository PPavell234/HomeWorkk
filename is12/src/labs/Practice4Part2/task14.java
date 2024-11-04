package labs.Practice4Part2;

import java.util.Scanner;


public class task14 {
    private final double G = 6.674 * Math.pow(10, -11); // Гравитационная постоянная
    private static final double COMET_RADIUS = 1.153 * Math.pow(10, 6); // Радиус кометы Галлея (в метрах)


    public static void main(String[] args) {
        task14 obj = new task14();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите скорость запуска (в милях в час): ");
        double launchSpeedMph = scanner.nextDouble();
        System.out.println(obj.halleySpeed(launchSpeedMph));
    }

    /**
     * Метод для расчета скорости отрыва и определения возможности возвращения астронавта на поверхность кометы.
     *
     * @param launchSpeedMph Скорость запуска в милях в час.
     * @return Строка, указывающая на возможность возвращения астронавта или необходимую массу кометы для возвращения.
     */
    public String halleySpeed(double launchSpeedMph) {
        double launchSpeedMps = launchSpeedMph * 0.44704; // Конвертация скорости в метры в секунду
        double radius = 11.2 * Math.pow(10, 3);
        double escapeVelocity = Math.sqrt((2 * (G * (1.3 * Math.pow(10, 22))) / COMET_RADIUS)); // Расчет скорости отрыва
        System.out.println("Скорость отрывания: " + escapeVelocity + " м/с");

        if (launchSpeedMps >= escapeVelocity) {
            System.out.println("Астронавт не вернется на поверхность кометы.");
            // Рассчитываем массу, необходимую для возвращения
            double requiredMass = (Math.pow(launchSpeedMps, 2) * COMET_RADIUS) / (2 * G);
            return "Масса кометы должна быть как минимум: " + requiredMass + " кг";
        } else {
            return "Астронавт вернется на поверхность кометы.";
        }
    }
}