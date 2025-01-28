package chapterFour;

import java.io.Console;

public class ReadPassword {
    static String name;

    public static void main(String[] args) {
        /*w   w  w  . d   e   m  o2  s  .  c  o  m  */
        Console console = System.console();

        name = console.readLine("%s", "name: ");

        char[] pw = console.readPassword("%s", "password: ");

        console.format("______: %s ", name);
        console.format("____: ");
        for (char c : pw) {
            console.format("%c", c);
        }
        console.format("\n");
        pw = null;


        String input;
        MyUtility mu = new MyUtility();
        while (true) {
            input = console.readLine("%s", "message:");
            console.format("new message: %s \n", input);
            console.format("new message: %s \n", mu.doStuff(input));

            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
        }

    }

}
