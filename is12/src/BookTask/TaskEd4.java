package BookTask;

import java.util.Scanner;

public class TaskEd4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число ");

        int dozensNumber = (int) input.nextDouble();
        int hundreds = (int) Math.floor((double) dozensNumber / 100);
        int hundred2 = dozensNumber % 100;
        int dozens = (dozensNumber / 10);
        int dozens2 = (dozensNumber / 5);

        //Этого не обзеательно делать можно было просто dozens % 10
        int until = (dozens * 10);
        int until2 = (int) Math.floor(dozensNumber - until);

        System.out.println(dozens);
        System.out.println(until2);


        //число при перестановки
        System.out.println("Первое число зачеркнули: " + dozens + until2);
        System.out.println(hundred2);
    }
}
