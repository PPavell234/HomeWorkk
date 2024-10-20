package labs.Practice4Part1;


public class Task9Time {
    //Переменные
    private int hour1;
    private int hour2;

    //Конструктор определяющий время, которое наступило сначало и потом
    public String Task9Time(String hour1, String hour2) {

        int limitTimeOne = 2400;
        int limitTimeTwo = 0;

        hour1 = hour1.replaceAll(":", "");
        hour2 = hour2.replaceAll(":", "");

        this.hour1 = Integer.parseInt(hour1);
        this.hour2 = Integer.parseInt(hour2);

        int hour1Temp = (int) Double.parseDouble(hour1);
        int hour2Temp = (int) Double.parseDouble(hour2);


        if (limitTimeOne >= hour1Temp || hour1Temp == limitTimeTwo && limitTimeOne >= hour2Temp || hour2Temp == limitTimeTwo) {
            hour1 = addCharToString(hour1, ':', 2);
            hour2 = addCharToString(hour2, ':', 2);
            if (hour1Temp < hour2Temp) {
                return " Сначало наступило время " + hour1 + " После этого наступило " + hour2;
            } else if (hour1Temp > hour2Temp) {
                return " Сначало наступило время " + hour2 + " После этого наступило " + hour1;
            }

        } else {
            return "Неправильно задано время";
        }

        return "Время равно";


    }

    public static String addCharToString(String str, char c, int pos) {

        // Создание объекта класса StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);

        //  метод insert(), в котором указывается позиция символа для вставки
        //
        stringBuffer.insert(pos, c);

        // Возвращает обновленную строку
        // Сцепленная строка
        return stringBuffer.toString();
    }


    public int compareTo(Task9Time o) {

        if (hour1 > hour2 || hour1 < hour2) {
            return 1;

        } else if (hour1 == hour2) {
            return 0;

        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Task9Time t = new Task9Time();


        System.out.println(t.Task9Time("24:00", "12:00"));
        System.out.println(t.Task9Time("13:00", "12:00"));
        System.out.println(t.Task9Time("13:00", "7:00"));
        System.out.println(t.compareTo(t));
    }
}
