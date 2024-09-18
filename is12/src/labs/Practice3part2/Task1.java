package labs.Practice3part2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите цену новой машины: ");
        double carPrice = in.nextDouble();
        System.out.print("Пожалуйста, введите пройденные мили в год: ");
        double milePerYear = in.nextDouble();
        System.out.print("Пожалуйста, введите цену бензина: ");
        double gasPrice = in.nextDouble();
        System.out.print("Пожалуйста, введите количество миль на галлон: ");
        double milePerGallon = in.nextDouble();
        System.out.print("Пожалуйста, введите цену автомобиля через 5 лет: ");
        double resalePrice = in.nextDouble();
        CarCost car1 = new CarCost(carPrice, milePerYear, gasPrice, milePerGallon, resalePrice);

        System.out.printf("Стоимость 5-летнего контракта на этот автомобиль составляет: $%.2f.\n", car1.getCost());
        in.close();
    }
}
