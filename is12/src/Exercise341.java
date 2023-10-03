package Exercises4;

import java.util.Scanner;

public class Exercise341 {
    //Задание 3.4.1

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
        } else {
            pay *=1.01f;
            System.out.println("  pay*= =" + pay);
        }
    }
}
