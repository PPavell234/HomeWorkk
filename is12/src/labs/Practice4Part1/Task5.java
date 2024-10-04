package labs.Practice4Part1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.print("Введите целое число ");
        num = in.nextInt();

        System.out.print("Это число содержит ");

        in.close();

        if (num >= 0 && num < 10) {
            System.out.print("1 ");
        } else if (num < 0) {
            num = num * -1;

            if (num >= 0 && num < 10) {
                System.out.print("1 ");
            } else if (num >= 10 && num < 100) {
                System.out.print("2 ");
            } else if (num >= 100 && num < 1000) {
                System.out.print("3 ");
            } else if (num >= 1000 && num < 10000) {
                System.out.print("4 ");
            } else if (num >= 10000 && num < 100000) {
                System.out.print("5 ");
            } else if (num >= 100000 && num < 1000000) {
                System.out.print("6 ");
            } else if (num >= 1000000 && num < 10000000) {
                System.out.print("7 ");
            } else if (num >= 10000000 && num < 100000000) {
                System.out.print("8 ");
            } else if (num >= 100000000 && num < 1000000000) {
                System.out.print("9 ");
            } else if (num >= 1000000000) {
                System.out.print("10 ");
            }
        } else if (num >= 10 && num < 100) {
            System.out.print("2 ");
        } else if (num >= 100 && num < 1000) {
            System.out.print("3 ");
        } else if (num >= 1000 && num < 10000) {
            System.out.print("4 ");
        } else if (num >= 10000 && num < 100000) {
            System.out.print("5 ");
        } else if (num >= 100000 && num < 1000000) {
            System.out.print("6 ");
        } else if (num >= 1000000 && num < 10000000) {
            System.out.print("7 ");
        } else if (num >= 10000000 && num < 100000000) {
            System.out.print("8 ");
        } else if (num >= 100000000 && num < 1000000000) {
            System.out.print("9 ");
        } else if (num >= 1000000000) {
            System.out.print("10 ");
        }

        System.out.println("цифр");
    }
}
