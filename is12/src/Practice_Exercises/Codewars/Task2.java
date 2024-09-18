package Practice_Exercises.Codewars;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
     /*
     "din"      =>  "((("
     "recede"   =>  "()()()"
     "Success"  =>  ")())())"
     "(( @"     =>  "))(("
      */

        System.out.println(encode("helloHollar"));

    }

    static String encode(String word) {
        word = word.toLowerCase();
        String result = "";

        for (int i=0;i<word.length();i++){
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(":")";
        }


        return result;
    }


}

