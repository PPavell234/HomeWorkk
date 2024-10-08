package labs.Practice4Part2;

import java.util.Scanner;

public class Task3 {

    private static final double FL_OZ = 29.5735; // 1 fluid ounce in milliliters
    private static final double GAL = 3.78541; // 1 gallon in milliliters
    private static final double LB = 453.592; // 1 pound in grams
    private static final double IN_TO_MM = 25.4; // 1 inch in millimeters
    private static final double FT_TO_CM = 30.48; // 1 foot in millimeters
    private static final double MI_TO_M = 1609.34; // 1 mile in millimeters


    private String number1;
    private String number2;
    private String number3;


    public static void main(String[] args) {

        Task3 t = new Task3();

        Scanner sc = new Scanner(System.in);


        System.out.println("Какую единицу вы хотите конвертировать fl-oz,gal,lb,in,ft,mi");
        t.number1 = sc.nextLine();
        System.out.println("Какие едницы вы хотите конвертировать ml, l, g, kg,mm,cm,m,km");
        t.number2 = sc.nextLine();
        System.out.println("Число");
        t.number3 = sc.nextLine();

        String numberNew = t.ConverVolume(t.number1, t.number2, t.number3);
        System.out.println("Конвентируемое число " + numberNew);


    }


    public String ConverVolume(String number1, String number2, String number3) {


        String numberString;
        this.number3 = String.valueOf(Double.parseDouble(number3));
        this.number1 = number1;
        this.number2 = number2;

        if (number1.equals("fl-oz")) {
            if (number2.equals("ml")) {
                numberString = String.valueOf(FL_OZ * Double.parseDouble(number3));
                return numberString;
            }
        }
        if (number1.equals("lb")) {
            if (number2.equals("g")) {
                numberString = String.valueOf(LB * Double.parseDouble(number3));
                return numberString;
            } else if (number2.equals("kg")) {

                numberString = String.valueOf((LB / 1000) * Double.parseDouble(number3));
                return numberString;
            }

        }
        if (number1.equals("gal")) {
            if (number2.equals("l")) {
                numberString = String.valueOf(GAL * Double.parseDouble(number3));
                return numberString;
            }
        }
        if (number1.equals("in")) {
            if (number2.equals("mm")) {
                numberString = String.valueOf(IN_TO_MM * Double.parseDouble(number3));
                return numberString;
            } else if (number2.equals("cm")) {
                numberString = String.valueOf((IN_TO_MM / 10) * Double.parseDouble(number3));
                return numberString;

            }
        }
        if (number1.equals("ft")) {
            if (number2.equals("cm")) {
                numberString = String.valueOf(FT_TO_CM * Double.parseDouble(number3));
                return numberString;
            } else if (number2.equals("m")) {
                numberString = String.valueOf((FT_TO_CM / 100) * Double.parseDouble(number3));
                return numberString;

            }
        }
        if (number1.equals("mi")) {
            if (number2.equals("m")) {
                numberString = String.valueOf(MI_TO_M * Double.parseDouble(number3));
                return numberString;
            } else if (number2.equals("km")) {
                numberString = String.valueOf((MI_TO_M / 1000) * Double.parseDouble(number3));
                return numberString;

            }
        }


        return "Невозможно переобразовать";

    }

}
