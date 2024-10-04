package labs.Practice4Part1;

import java.util.Scanner;

public class Task6 {

    
    public String firstAndLast(String word, String word2) {
        if (Character.toUpperCase(word.charAt(0)) == Character.toUpperCase(word2.charAt(0)) && Character.toUpperCase(word.length() - 1) == Character.toUpperCase(word2.length() - 1)) {
            return " Первая и последняя буква у слов " + word + " и " + word2 + " Равны";
        } else {
            return " Первая и последняя буква у слов " + word + " и " + word2 + " Не Равны";
        }


    }


    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ввидете первое слово");
        String wordOne = sc.nextLine();*/

        Task6 task6 = new Task6();

        System.out.println(task6.firstAndLast("Pooop", "Ptioo2"));

     /*   String symbolOne = String.valueOf(wordOne.charAt(0));
        String symbolTwo = String.valueOf();

        System.out.println(symbolOne + symbolTwo);*/

        /*char symbolWordOne = wordOne.charAt(0);
        char symbolWordTwo = (char) (wordOne.length()-1);*/
      /*  System.out.println("Ввидете второе слово слово");
        String wordTwo = sc.nextLine();*/

        //System.out.println(wordOne.charAt(0) + " " + wordOne.charAt(wordOne.length()-1));

      /*  if (symbolWordOne == symbolWordTwo){
            System.out.println("Равны");


        }*/

    }

}
