package labs.Practice4Part2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class testMain {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
        String dateString; // example date string
        Scanner sc = new Scanner(System.in);
        dateString = sc.nextLine();
        dateString = dateString.replaceAll(" ", "/");

        Date date = sdf.parse(dateString);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1; // add 1 to get the month as 1-12

        System.out.println("Day: " + day); // prints 24
        System.out.println("Month: " + month); // prints 7


    }
}
