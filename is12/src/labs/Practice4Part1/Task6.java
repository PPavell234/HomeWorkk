package labs.Practice4Part1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task6 {
    private static String wordOne;
    private static String wordTwo;


    /**
     * Метод firstAndLast проверяет, равны ли первая и последняя буквы двух слов.
     *
     * <p>Метод игнорирует регистр букв и проверяет, что оба слова содержат только буквы. * Если одно из слов недопустимо (содержит не буквы), возвращается сообщение об ошибке.</p>
     *
     * @param word первое слово для сравнения * @param word2 второе слово для сравнения
     * @return строка с сообщением о результате сравнения
     */

    public static String firstAndLast(String word, String word2) {
        wordOne = word;
        wordTwo = word2;
        if (isValidString(wordOne) && isValidString(wordTwo)) {
            if (Character.toUpperCase(word.charAt(0)) == Character.toUpperCase(word2.charAt(0)) && Character.toUpperCase(word.charAt(word.length() - 1)) == Character.toUpperCase(word2.charAt(word2.length() - 1))) {
                return "Первая и последняя буква у слов " + word + " и " + word2 + " равны";
            } else {

                return "Первая и последняя буква у слов " + word + " и " + word2 + " не равны";
            }
        }
        return "Error";


    }

    /**
     * Метод isValidString проверяет, состоит ли строка только из букв.
     *
     * @param input строка, которую необходимо проверить * @return true, если строка содержит только буквы; false в противном случае
     */

    private static boolean isValidString(String input) {
        // Регулярное выражение для проверки, что строка содержит только буквы
        Pattern pattern = Pattern.compile("^[a-zA-Zа-яА-ЯёЁ]+$");
        return pattern.matcher(input).matches();
    }


    public static void main(String[] args) {



        System.out.println(firstAndLast("world1", "world"));


    }

}
