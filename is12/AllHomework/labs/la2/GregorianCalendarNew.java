package labs.la2;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarNew {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        GregorianCalendar natashiasBirthday = new GregorianCalendar(2002, GregorianCalendar.DECEMBER, 11);
        String[] day = new DateFormatSymbols().getWeekdays();

        //день недели через 100 дней
        System.out.println("Через 100 дней наступит день " + day[cal.get(GregorianCalendar.DAY_OF_WEEK)]);
        // день моего дня рождения
        System.out.println("День моего рождения был " + day[natashiasBirthday.get(GregorianCalendar.DAY_OF_WEEK)]);
        //1000 дней к моему дню рождения
        natashiasBirthday.add(Calendar.DAY_OF_MONTH, 10000);
        //дату через 10 000 дней
        System.out.println("Через 10 000 дней после моего дня рождения эта дата была " + (natashiasBirthday.get(GregorianCalendar.MONTH) + 1)
                + "/" + (natashiasBirthday.get(GregorianCalendar.DAY_OF_MONTH)) + "/" + (natashiasBirthday.get(GregorianCalendar.YEAR)));
    }
}
