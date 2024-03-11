package labs.la2;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.Year;
import java.time.format.DateTimeFormatter;


public class LocalDateT {
    public static void main(String[] args) throws ParseException {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM.dd.yyyy");

        // день недели «PI day», то есть 14 марта текущего года.
        String pi_day = "3.14" + "." + currentYear;
        Date dt1 = dateFormat1.parse(pi_day);
        DateFormat dateFormat2 = new SimpleDateFormat("EEEE");
        String finalDay = dateFormat2.format(dt1);
        System.out.println("Распечатайте день недели «PI day», то есть 14 марта текущего года. (" + currentYear + "): " + finalDay); // output the day value

        // дату и день недели «Дня программиста» в текущем году (256-й день года).

        int programmersDay = 256 ;
        Year year = Year.of( currentYear );
        java.time.LocalDate programmersDate = year.atDay(programmersDay);

        String formattedProgDate = ((java.time.LocalDate) programmersDate).format(DateTimeFormatter.ofPattern("MM.dd.yyyy"));
        System.out.println("Выведите дату и день недели «Дня программиста» в текущем году (256-й день года). (" + currentYear + ") <MM.dd.yyyy>: "
                + formattedProgDate);

        //дату и день недели, которая на 10 000 дней раньше, чем сегодня

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -10000);
        Date date = cal.getTime();
        String formattedDate = dateFormat1.format(date);
        System.out.println("Распечатайте дату и день недели даты, которая на 10 000 дней раньше сегодняшнего дня. <MM.dd.yyyy>: "+ formattedDate);
    }
}
