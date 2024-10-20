package labs.Practice4Part1;

import java.util.Scanner;

public class Task6 {
    private static String wordOne;
    private static String wordTwo;


    public static String firstAndLast(String word, String word2) {
        wordOne = word;
        wordTwo = word2;

        if (Character.toUpperCase(word.charAt(0)) == Character.toUpperCase(word2.charAt(0)) && Character.toUpperCase(word.charAt(word.length() - 1)) == Character.toUpperCase(word2.charAt(word2.length() - 1))) {
            return "Первая и последняя буква у слов " + word + " и " + word2 + " равны";
        } else {

            return "Первая и последняя буква у слов " + word + " и " + word2 + " не равны";

        }


    }


    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ввидете первое слово");
        String wordOne = sc.nextLine();*/

        //Проверяем слоово word1 и world2 Сравниваются их Первая и последняя бува они должны у обоих слов одинаковые
        System.out.println(firstAndLast("Topk2", "Topk2"));

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
