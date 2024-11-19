package BookTask;

import java.util.Scanner;
import java.util.SortedMap;

public class ProgrammTest {

    private int x,y;


    public static int sum(int x,int y){
        return x + y;
    }
    private static void exitProgram(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Вы хотите выйти ? y/n");
        String input = sc.next();

        if (input.equalsIgnoreCase("y")){
            System.exit(0);
        } else if (input.equalsIgnoreCase("n")){
            return;
        } else {
            System.out.println("Ошибка ввода");
            exitProgram();

        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("Введите число x");
            int x=sc.nextInt();
            System.out.println("Введите число y");
            int y=sc.nextInt();

            System.out.println("Ответ получается " + sum(x,y));
            exitProgram();





        }





    }
}
