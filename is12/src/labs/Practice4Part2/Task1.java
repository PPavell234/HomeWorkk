package labs.Practice4Part2;

import java.util.Date;
import java.util.Scanner;
import java.time.Year;

public class Task1 {
    final private String DECEMBER;
    final private String JANUARY;
    final private String FEBRUARY;
    final private String MARCH;
    final private String APRIL;
    final private String MAY;
    final private String JUNE;
    final private String JULY;
    final private String AUGUST;
    final private String SEPTEMBER;
    final private String OCTOBER;
    final private String NOVEMBER;

    public Task1() {
        this.DECEMBER = "December";
        this.JANUARY = "January";
        this.FEBRUARY = "February";
        this.MARCH = "March";
        this.APRIL = "April";
        this.MAY = "May";
        this.JUNE = "June";
        this.JULY = "July";
        this.AUGUST = "August";
        this.SEPTEMBER = "September";
        this.OCTOBER = "October";
        this.NOVEMBER = "November";
    }

    public Date sesonPrint() {


        final int DAY_FEBRUARY = 21;
        String moth;
        int day;
        int currentYear = Year.now().getValue();
        Scanner sc = new Scanner(System.in);
        //String converMoth = String.valueOf(moth);


        System.out.println("Введите месяц");
        moth = sc.nextLine();
        System.out.println("Введите день");

        day = sc.nextInt();


        try {
            if (moth.equalsIgnoreCase(DECEMBER) || moth.equalsIgnoreCase(JANUARY) || moth.equalsIgnoreCase(FEBRUARY)) {
                if (day == DAY_FEBRUARY) {
                    System.out.println("Winter и месяц " + FEBRUARY);
                } else {
                    System.out.println("Winter или January ");
                }
            } else if (moth.equalsIgnoreCase(MARCH) || moth.equalsIgnoreCase(APRIL) || moth.equalsIgnoreCase(MAY)) {
                System.out.println("Spring");
            } else if (moth.equalsIgnoreCase(JUNE) || moth.equalsIgnoreCase(JULY) || moth.equalsIgnoreCase(AUGUST)) {
                System.out.println("Summer");
            } else if (moth.equalsIgnoreCase(SEPTEMBER) || moth.equalsIgnoreCase(OCTOBER) || moth.equalsIgnoreCase(NOVEMBER)) {
                System.out.println("Autumn");

            }
        } catch (NumberFormatException e) {
            // Игнорируем ошибку, если ввод не является числом
        }

        int converMoth = Integer.parseInt(moth);
        Date d = new Date(currentYear - 1900, converMoth, day);

        return d;


    }

 /*   public String getSeason() {
    }*/

    public static void main(String[] args) {
        Task1 t = new Task1();
        t.sesonPrint();


    }


}
