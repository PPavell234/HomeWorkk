package labs.Practice4Part2;

import java.util.Scanner;

public class task14 {
    private final double G = 6.674 * Math.pow(10, -11);
    private static final double COMET_RADIUS = 1.153 * Math.pow(10, 6); // Радиус кометы Галлея (в метрах)

    public static void main(String[] args) {
        task14 obj = new task14();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите скорость запуска (в милях в час): ");
        double launchSpeedMph = scanner.nextDouble();
        System.out.println(obj.halleySpeed(launchSpeedMph));
    }

    public String halleySpeed(double launchSpeedMph) {
        double launchSpeedMps = launchSpeedMph * 0.44704;
        double radius = 11.2 * Math.pow(10 ^ 3, 2);
        double escapeVelocity = Math.sqrt((2 * (G * (1.3 * Math.pow(10, 22))) / COMET_RADIUS));
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


// Функция для получения массы кометы Галлея (примерное значение)

