package labs.Practice4Part2;

import java.util.Scanner;

public class Task10 {
    //nameСity = nameСity.toLowerCase();
    private int number;

  /*  public String talbeIsNameOfTheEmi(int number){

    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tableName;
        int numberVariable;
        System.out.println("Что вы хотите ввести длину волны или частоту ? : ");
        tableName = sc.nextLine();
        numberVariable = sc.nextInt();


        if (tableName.equalsIgnoreCase("частота") || tableName.equalsIgnoreCase("частоту")) {
            System.out.println("В какой степени вы хотите ввести 3 * 10^x ");
            if (numberVariable >= 0 && numberVariable <= 2) {
                System.out.println("3 * 10^" + numberVariable + " Крайне и сверх низкие");
            } else if (numberVariable >= 2 && numberVariable <= 4) {
                System.out.println("3 * 10^" + numberVariable + " Низкие");
            } else if (numberVariable >= 4 && numberVariable <= 5) {
                System.out.println("3 * 10^" + numberVariable + " Длинные");
            } else if (numberVariable >= 5 && numberVariable <= 6) {
                System.out.println("3 * 10^" + numberVariable + " Средние");
            } else if (numberVariable >= 6 && numberVariable <= 7) {
                System.out.println("3 * 10^" + numberVariable + " Короткие");
            } else if (numberVariable >= 7 && numberVariable <= 8) {
                System.out.println("3 * 10^" + numberVariable + " Ультра короткие");
            } else if (numberVariable >= 8 && numberVariable <= 10) {
                System.out.println("3 * 10^" + numberVariable + " Микроволны");
            } else if (numberVariable >= 12 && numberVariable < 14) {
                System.out.println("3 * 10^" + numberVariable + " Инфакрасные");
            } else if (numberVariable == 14) {
                System.out.println("3 * 10^" + numberVariable + " Инфакрасные или видимые или ультрафиолетовые");
            } else if (numberVariable > 14 && numberVariable <= 16) {
                System.out.println("3 * 10^" + numberVariable + " Ультрафиолетовые");

            } else if (numberVariable >= 17 && numberVariable <= 19) {
                System.out.println("3 * 10^" + numberVariable + " Рентгеновское излучение");

            } else if (numberVariable >= 20 && numberVariable <= 22) {
                System.out.println("3 * 10^" + numberVariable + " Гамма- излучение");
            }

        } else if (tableName.equalsIgnoreCase("волна")) {
            System.out.println("В какой степени вы хотите ввести 10^x ");
            if (numberVariable >= 8 && numberVariable <= 16) {
                System.out.println("10^" + numberVariable + " Крайне и сверх низкие");
            } else if (numberVariable >= 4 && numberVariable <= 6) {
                System.out.println("10^" + numberVariable + " Низкие");
            } else if (numberVariable >= 3 && numberVariable <= 4) {
                System.out.println("10^" + numberVariable + " Длинные");
            } else if (numberVariable >= 2 && numberVariable <= 3) {
                System.out.println("10^" + numberVariable + " Средние");
            } else if (numberVariable >= 1 && numberVariable <= 2) {
                System.out.println("10^" + numberVariable + " Короткие");
            } else if (numberVariable >= 0 && numberVariable <= 1) {
                System.out.println("10^" + numberVariable + " Ультра короткие");
            } else if (numberVariable >= -3 && numberVariable <= 0) {
                System.out.println("10^" + numberVariable + " Микроволны");
            } else if (numberVariable > -6 && numberVariable < -4) {
                System.out.println("10^" + numberVariable + " Инфакрасные");
            } else if (numberVariable == -6) {
                System.out.println("3 * 10^" + numberVariable + " Инфакрасные или видимые или регеновское");
            } else if (numberVariable >= -8 && numberVariable < -6) {
                System.out.println("10^" + numberVariable + " Рентгеновское излучение");
            } else if (numberVariable >= -11 && numberVariable <= -9) {
                System.out.println("10^" + numberVariable + " Гамма- излучение");
            }


        }

    }
}

//The table is the name of the EMI

