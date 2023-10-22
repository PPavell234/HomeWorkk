package Exercises4;

import java.util.Scanner;

public class Exercise332 {
    //Задание 3.3.2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Score = ");
        float score=input.nextFloat();
        System.out.print("Pay = ");
        float pay=input.nextFloat();

        System.out.print("score ="+ score);

        if (score > 90) {
            pay *=1.03f;
            System.out.println("  pay*= =" + pay);
        }
    }
}

