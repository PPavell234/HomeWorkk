package labs.Practice4Part2;

public class Task5 {
    public static void main(String[] args) {
        Task5 t = new Task5();
        t.isLeapYear(200);
        t.isLeapYear(400);
        t.isLeapYear(2000);

    }


    /**
     * Проверяет, является ли указанный год високосным.
     * <p>
     * Високосный год определяется по следующим правилам:
     * <ul>
     *     <li>Год, который делится на 4, является високосным.</li>
     *     <li>Однако, если год делится на 100, он не является високосным,
     *     за исключением случаев, когда он также делится на 400.</li>
     * </ul>
     * </p>
     *
     * @param year год для проверки.
     * @return true, если год високосный; false в противном случае.
     */
    boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Высокосный");
            return true;
        }
        System.out.println("Не высокосный");
        return false;
    }
}
