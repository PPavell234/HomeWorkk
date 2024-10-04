package labs.Practice4Part1;

public class Task10Grade {

    final private double A = 4;
    final private double B = 3;
    final private double C = 2;
    final private double D = 1;
    final private double F = 0;
    private String numericalGrade;
    private double count;


    public void setGrage(String numericalGrade) {
        this.numericalGrade = numericalGrade;


        double add = 0.3;


        if (numericalGrade.equals("A") || numericalGrade.equals("+A") || numericalGrade.equals("-A")) {
            count = A;
            if (numericalGrade.charAt(0) == '-') {
                count = count - add;
            }
            if (numericalGrade.charAt(0) == '+') {
                count = count + 0.3;
            }

        } else if (numericalGrade.equals("B") || numericalGrade.equals("+B") || numericalGrade.equals("-B")) {
            count = B;
            if (numericalGrade.charAt(0) == '-') {
                count = count - add;
            }
            if (numericalGrade.charAt(0) == '+') {
                count = count + 0.3;
            }
        } else if (numericalGrade.equals("C") || numericalGrade.equals("+C") || numericalGrade.equals("-C")) {
            count = C;
            if (numericalGrade.charAt(0) == '-') {
                count = count - add;
            }
            if (numericalGrade.charAt(0) == '+') {
                count = count + 0.3;
            }

        } else if (numericalGrade.equals("D") || numericalGrade.equals("+D") || numericalGrade.equals("-D")) {
            count = D;
            if (numericalGrade.charAt(0) == '-') {
                count = count - add;
            }
            if (numericalGrade.charAt(0) == '+') {
                count = count + 0.3;
            }
        } else if (numericalGrade.equals("F") || numericalGrade.equals("+F") || numericalGrade.equals("-F")) {
            count = F;
            if (numericalGrade.charAt(0) == '-') {
                count = count - add;
            }
            if (numericalGrade.charAt(0) == '+') {
                count = count + 0.3;
            }
        }


    }


    public double getNumericalGrade() {
        return count;
    }

    public String getLetterGrade() {
        return numericalGrade;
    }


    public static void main(String[] args) {
        Task10Grade task10Grade = new Task10Grade();

        task10Grade.setGrage("+D");
        System.out.println(task10Grade.getNumericalGrade());
        System.out.println(task10Grade.getLetterGrade());

        System.out.println("------");

        task10Grade.setGrage("-C");
        System.out.println(task10Grade.getNumericalGrade());
        System.out.println(task10Grade.getLetterGrade());

    }


}
