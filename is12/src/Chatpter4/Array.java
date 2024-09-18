package Chatpter4;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int number = 0;
        int[] myArray = {23, 44, 33, 21};
        String length = Arrays.toString(myArray);
        System.out.println(length);

        char myChar = '3';

        if (length.contains(String.valueOf(myChar))) {
            number+=1;
            System.out.println(number);

        }

    }
}
