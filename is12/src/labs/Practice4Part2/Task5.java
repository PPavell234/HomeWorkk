package labs.Practice4Part2;

public class Task5 {
    public static void main(String[] args) {
        Task5 t = new Task5();
        t.isLeapYear(200);

    }

    boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Высокосный");
            return true;
        }
        System.out.println("Не высокосный");
        return false;
    }
}
