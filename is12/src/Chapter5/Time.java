package Chapter5;

//Exerise 2
public class Time {

    private int time, hour, minute;


    public Time(int time) {
        this.time = time;

        hour = this.time / 100;
        minute = this.time % 100;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int compareTo(Time time) {
        int hour1, hour2, minute1, minute2;
        hour2 = time.getHour();
        minute2 = time.getMinute();

        hour1 = hour;
        minute1 = minute;

        if (hour1 < hour2) {
            System.out.println("Время 1 Наступает первым");
            return -1;
        } else if (hour1 == hour2) {
            if (minute1 < minute2) {
                System.out.println("Время 1 Наступает первым");
                return -1;
            } else if (minute1 == minute2) {
                System.out.println("Время 1 и время 2 совпадают");
                return 0;
            } else {
                System.out.println("Время 2 Наступает первым");
                return 1;
            }
        } else {
            System.out.println("Время 2 Наступает первым");
            return 1;
        }

    }

    /*-1: Означает, что первое время (hour1, minute1) наступает раньше второго времени (hour2, minute2).
       0: Означает, что оба времени совпадают.
       1: Означает, что второе время наступает раньше первого времени.*/

}
