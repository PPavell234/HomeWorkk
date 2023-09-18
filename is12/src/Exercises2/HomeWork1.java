package Exercises2;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter seconds");
        int s = in.nextInt();

        int sec = s % 60;
        int min = (s / 60) % 60;
        int hours = (s / 60) / 60;

        System.out.println(hours + ":" + min + ":" + sec);
    }
}
