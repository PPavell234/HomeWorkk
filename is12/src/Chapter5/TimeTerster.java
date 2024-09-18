package Chapter5;

import java.util.Scanner;

//Exerise 2

public class TimeTerster {
    public static void main(String[] args) {
        int time1, time2;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите время в военной форме: ");
        time1 = in.nextInt();
        System.out.print("Укажите другое время: ");
        time2 = in.nextInt();

        in.close();

        Time firstTime = new Time(time1);
        Time secondTime = new Time(time2);

        System.out.println(firstTime.compareTo(secondTime));

    }
}
