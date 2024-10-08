package labs.Practice4Part2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    private int month;
    private int day;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
    private Date date;
    private String dataStirng;


    //овен,телец,близнец,рак,лев,дева,весы,скорпион,стрелец,козерог,водолей,рыбы


    //получение даты
    public String horoscopeMonthAndDay() throws ParseException {
        this.dataStirng = dataStirng;


        //String dateString; // example date string
        Scanner sc = new Scanner(System.in);
        dataStirng = sc.nextLine();
        dataStirng = dataStirng.replaceAll(" ", "/");

        date = sdf.parse(dataStirng);


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH) + 1;

        System.out.println();


        return sdf.format(date);


    }

    //предсказание
    private String prediction() throws ParseException {


        //Овен
        if (day <= 21 && month == 3 || day <= 20 && month == 4) {
            return "Вы можете почувствовать внезапное желание рисковать сегодня, Овен." +
                    " Не бойтесь выйти из зоны комфорта и попробовать что-то новое. " +
                    "Ваша смелость будет вознаграждена неожиданными возможностями.";
            //Телец
        } else if (day <= 21 && month == 4 || day <= 21 && month == 5) {
            return "Сегодня - отличный день, чтобы сосредоточиться на ваших отношениях, Телец." +
                    " Питайте свои связи с любимыми и коллегами. Неожиданный звонок или сообщение от старого друга может принести улыбку на ваше лицо.";
            //Близнецы
        } else if (day <= 22 && month == 5 || day <= 21 && month == 6) {
            return "Ваш быстрый ум и остроумные идеи будут служить вам сегодня, Близнецы. " +
                    "Используйте свои навыки общения, чтобы разрешить любые конфликты или недопонимания. " +
                    "Творческий проект может потребовать вашего внимания.";
            //Рак
        } else if (day <= 22 && month == 6 || day <= 22 && month == 7) {
            return "Заботьтесь о вашем эмоциональном благополучии сегодня, Рак." +
                    " Практикуйте самоуспокоение и приоритезируйте свое психическое здоровье. " +
                    "Расслабляющая ванна или хорошая книга могут быть именно тем, что вам нужно";
        }
        //И т.д


        return "Ошибка ввода";
    }

    public static void main(String[] args) throws ParseException {
        Task2 task = new Task2();
        System.out.print("Введите свой день рождения(день и месяц):");

        System.out.println(task.horoscopeMonthAndDay() + " " + task.prediction());

    }

}


  /*  public void horoscope(){
        System.out.println("Введите свой день рождения (день и месяц):" + horoscopeMonthAndDay());
    }*/





