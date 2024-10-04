package labs.Practice4Part1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time {

    private String hour1;
    private String hour2;




    public String Time(String hour1, String hour2) {

        this.hour1 = hour1;
        this.hour2 = hour2;

        hour1 = hour1.replaceAll(":", "");
        hour2 = hour2.replaceAll(":", "");




  /*      if ()

        if (hour1 > hour2) {
            return " Сначало наступило время " + hour1 + "После этого наступило " + hour2;
        } else if (hour1 < hour2) {
            return " Сначало наступило время " + hour2 + "После этого наступило " + hour1;
        }*/

        return "Время равно";
    }

    public static void main(String args[]) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first time (hh:mm aa): ");
        String time = input.nextLine();
        System.out.println();
        System.out.print("Enter second time (hh:mm aa): ");
        String time2 = input.nextLine();
        System.out.println();
        DateFormat sdf = new SimpleDateFormat("hh:mm aa");
        Date d1 = sdf.parse(time);
        Date d2 = sdf.parse(time2);

        System.out.println("Time: " + sdf.format(d1));
        System.out.println("Time: " + sdf.format(d2));
    }
}

