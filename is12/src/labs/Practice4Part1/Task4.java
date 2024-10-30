package labs.Practice4Part1;

public class Task4 {

    /**
     * Генерирует таблицу истинности для двух логических выражений:
     * <p>
     * 1. (p && q) || !r
     * 2. !(p && (q || !r))
     * <p>
     * Перебирает все возможные комбинации булевых значений для переменных p, q и r,
     * вычисляет значения истинности выражений для каждой комбинации и выводит результаты
     * в отформатированной таблице.
     *
     * @param args Аргументы командной строки (не используются в этой программе)
     */
    public static void main(String[] args) {
        System.out.println("  p   |  q   |  r   | (p && q) || !r   | !(p && (q || !r))");
        System.out.println("---------------------------------------------");

        for (int p = 0; p <= 1; p++) {
            for (int q = 0; q <= 1; q++) {
                for (int r = 0; r <= 1; r++) {

                    boolean pBool = (p == 1);
                    boolean qBool = (q == 1);
                    boolean rBool = (r == 1);


                    boolean expr1 = (pBool && qBool) || !rBool;
                    boolean expr2 = !(pBool && (qBool || !rBool));


                    System.out.printf("%b | %b | %b | %b | %b%n", pBool, qBool, rBool, expr1, expr2);
                }
            }
        }
    }
}