package chapterFour;


import java.util.Scanner;

public class TwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Число 1");
        double oneNumber = in.nextDouble();
        System.out.println("Число 2");
        double twoNumber = in.nextDouble();

        double sum = oneNumber + twoNumber;
        double difference = oneNumber - twoNumber;
        double product = oneNumber * twoNumber;
        double average = sum / difference;
        double distance = Math.sqrt(product);
        double max = Math.max(oneNumber, twoNumber);
        double min = Math.min(oneNumber, twoNumber);

        System.out.printf("Сумма: %8.2f", sum);
        System.out.printf("\nРазность: %8.2f", difference);
        System.out.printf("\nСреднее: %8.2f", average);
        System.out.printf("\nРастояние: %8.2f", distance);
        System.out.printf("\nМаксимальное: %8.2f", max);
        System.out.printf("\nМинимальное: %8.2f", min);

    }
}
