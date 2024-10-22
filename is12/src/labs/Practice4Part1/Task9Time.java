package labs.Practice4Part1;


public class Task9Time {

    /**
     * Сравнивает два объекта времени и возвращает строку, описывающую их порядок.
     *
     * @param t1 первое время для сравнения * @param t2 второе время для сравнения
     * @return строка, указывающая, какое время наступило раньше, позже или если они равны
     */
    public static String compareTimes(Time t1, Time t2) {
        int comparison = t1.compareTo(t2);
        if (comparison < 0) {
            return "Сначала наступило время " + t1.format() + ", после этого наступило " + t2.format();
        } else if (comparison > 0) {
            return "Сначала наступило время " + t2.format() + ", после этого наступило " + t1.format();
        } else {
            return "Время равно " + t1.format();
        }
    }

    public static void main(String[] args) {
        Time time1 = new Time("07:00");
        Time time2 = new Time("12:00");
        Time time3 = new Time("07:00");
        Time time4 = new Time("15:00");

        System.out.println(compareTimes(time1, time2));
        System.out.println(compareTimes(time4, time3));
        System.out.println(time4.compareTo(time1));
        System.out.println(time1.compareTo(time2));
        System.out.println(time1.compareTo(time3));

    }
}





