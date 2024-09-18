package Practice_Exercises.chp;

import java.util.Scanner;

public class CostCola2 {
    public static void main(String[] args) {

        final double BOTTLE_COLA_CAPACITY = 2.000;
        final double POT_COLA_CAPACITY = 0.355;
        final double CONTAINER_COLA = 6;

        Scanner in = new Scanner(System.in);

        System.out.print("Цена за банку: ");
        double potPrice = in.nextDouble();
        System.out.print("Цена за бутылку: ");
        double bottlePrice = in.nextDouble();

        double PurchasePot = potPrice / (POT_COLA_CAPACITY * CONTAINER_COLA);
        double PurchaseBottle = bottlePrice / BOTTLE_COLA_CAPACITY;

        System.out.printf("Цена упаковки за литр для банки: %8.2f%nЦена упаковки за литр для бутылки: %8.2f%n", PurchasePot, PurchaseBottle);
    }
}
