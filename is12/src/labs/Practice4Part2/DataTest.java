package labs.Practice4Part2;

import java.util.Date;
import java.time.Year;



public class DataTest {

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();

        System.out.println(date1.getTime());
        System.out.println(date2.getTime());

        System.out.println(date1.equals(date2));
        int currentYear = Year.now().getValue();

        System.out.println(currentYear);

    }
}
