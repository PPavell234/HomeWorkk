package BookTask;

import java.util.Scanner;

public class TaskEd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число ");

        double dozensNumber = input.nextDouble();

        int dozens = (int) Math.floor(dozensNumber / 10);
        int until = (dozens * 10);
        int until2 = (int) Math.floor(dozensNumber - until);

        System.out.println(dozens);
        System.out.println(until2);


        //число при перестановки
        System.out.println("Число при перестановки: " + until2 + dozens);
    }
}
