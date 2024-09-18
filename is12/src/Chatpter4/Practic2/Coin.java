package Chatpter4.Practic2;

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
        System.out.print("Пожалуйста, введите стоимость каждой первой монеты: ");
        firstCoinValue = in.nextDouble();
        System.out.print("Пожалуйста, введите номер первой монеты: ");
        firstCoinNumber = in.nextDouble();

        System.out.print("Пожалуйста, введите стоимость каждой второй монеты: ");
        secondCoinValue = in.nextDouble();
        System.out.print("Пожалуйста, введите количество конечной монеты ");
        secondCoinNumber = in.nextDouble();

        System.out.print("Пожалуйста, введите стоимость каждой первой монеты: ");
        thirdCoinValue = in.nextDouble();
        System.out.print("Пожалуйста, введите номер первой монеты: ");
        thirdCoinNumber = in.nextDouble();

        total = firstCoinValue * firstCoinNumber + secondCoinValue * secondCoinNumber + thirdCoinValue * thirdCoinNumber;

    }

    public double totalAmount() {

        return total;
    }
}

