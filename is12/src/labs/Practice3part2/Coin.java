package labs.Practice3part2;

import java.util.Scanner;

public class Coin {
    private double firstCoinValue;
    private double firstCoinNumber;
    private double secondCoinValue;
    private double secondCoinNumber;
    private double thirdCoinValue;
    private double thirdCoinNumber;
    private double total;

    public Coin() {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the value each of 1st coin: ");
        firstCoinValue = in.nextDouble();
        System.out.print("Please enter the number of 1st coin: ");
        firstCoinNumber = in.nextDouble();

        System.out.print("Please enter the value each of 2nd coin: ");
        secondCoinValue = in.nextDouble();
        System.out.print("Please enter the number of end coin: ");
        secondCoinNumber = in.nextDouble();

        System.out.print("Please enter the value each of 1st coin: ");
        thirdCoinValue = in.nextDouble();
        System.out.print("Please enter the number of 1st coin: ");
        thirdCoinNumber = in.nextDouble();

        total = firstCoinValue * firstCoinNumber + secondCoinValue * secondCoinNumber + thirdCoinValue * thirdCoinNumber;
    }

    public double totalAmount() {

        return total;
    }
}
