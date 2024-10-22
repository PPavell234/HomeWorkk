package labs.Practice4Part1;

public class Task10Grade {

    final private double A = 4;
    final private double B = 3;
    final private double C = 2;
    final private double D = 1;
    final private double F = 0;
    private String numericalGrade;
    private double count;


    /**
     * Устанавливает буквенную оценку и вычисляет соответствующее
     * числовое значение.
     *
     * @param numericalGrade буквенная оценка (например, "A", "B+", "C-","F")
     */
    public void setGrade(String numericalGrade) {
        this.numericalGrade = numericalGrade;
        count = 0; // Сброс значения count перед каждой установкой

        double add = 0.3;

        if (numericalGrade.equals("A") || numericalGrade.equals("A+") || numericalGrade.equals("A-")) {
            count = A;
            if (numericalGrade.equals("A-")) {
                count -= add;
            } else if (numericalGrade.equals("A+")) {
                count += add;
            }
        } else if (numericalGrade.equals("B") || numericalGrade.equals("B+") || numericalGrade.equals("B-")) {
            count = B;
            if (numericalGrade.equals("B-")) {
                count -= add;
            } else if (numericalGrade.equals("B+")) {
                count += add;
            }
        } else if (numericalGrade.equals("C") || numericalGrade.equals("C+") || numericalGrade.equals("C-")) {
            count = C;
            if (numericalGrade.equals("C-")) {
                count -= add;
            } else if (numericalGrade.equals("C+")) {
                count += add;
            }
        } else if (numericalGrade.equals("D") || numericalGrade.equals("D+") || numericalGrade.equals("D-")) {
            count = D;
            if (numericalGrade.equals("D-")) {
                count -= add;
            } else if (numericalGrade.equals("D+")) {
                count += add;
            }
        } else if (numericalGrade.equals("F")) {
            count = F; // "F", "F+" и "F-" не имеют смысла, так как F - это 0
        }
    }


    /**
     * Получает числовое значение текущей оценки.
     *
     * @return числовое значение оценки
     */
    public double getNumericalGrade() {
        return count;
    }

    /**
     * Получает буквенную оценку.
     *
     * @return буквенная оценка
     */

    public String getLetterGrade() {
        return numericalGrade;
    }


    public static void main(String[] args) {
        Task10Grade task10Grade = new Task10Grade();

        task10Grade.setGrade("B-");
        System.out.println(task10Grade.getNumericalGrade());
        System.out.println(task10Grade.getLetterGrade());

        System.out.println("------");

        task10Grade.setGrade("A-");
        System.out.println(task10Grade.getNumericalGrade());
        System.out.println(task10Grade.getLetterGrade());

    }


}
