package chapterFour;

import java.io.CharArrayWriter;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class Counter {

    private int value;


    public int getValue(){
        return value;
    }

    public void addValue(int value){
        this.value += value;
    }

    public static void main(String[] args) throws IOException
    {

        // Initializing the character array
        char[] geek = {'G', 'E', 'E', 'K', 'S'};
        String geek_str;

        // Initializing the CharArrayWriter
        CharArrayWriter char_array1 = new CharArrayWriter();
        CharArrayWriter char_array2 = new CharArrayWriter();
        CharArrayWriter char_array3 = new CharArrayWriter();

        for(int c = 72; c < 77; c++)
        {
            // Use of write(int char)
            // Writer int value to the Writer
            char_array1.write(c);
        }

        // Use of toString() : returning Buffer content as String
        geek_str = char_array1.toString();
        System.out.println("Using write(int char) : "+ geek_str);


        // Use of write(String str, int offset, int maxlen)
        // writes some part of the string to the Writer.
        char_array2.write(geek_str, 2, 3);

        System.out.println("write(str, offset, maxlen) : "+ char_array2.toString());


        // Use of write(char[] carray, int offset, int maxlen)
        // writes some part of the Char[] geek to the Writer
        char_array3.write(geek, 2, 3);
        System.out.println("write(carray, offset, maxlen) : "+ char_array3.toString());

        // get buffered content as string
        String str = char_array3.toString();


        // Use of writeTo(Writer out_stream)
        char_array3.writeTo(char_array1);

        System.out.println("\nchar_array3 to char_array1 : "+ char_array1.toString());


        // Use of size() method
        System.out.println("\nSize of char_array1 : "+ char_array1.size());
        System.out.println("Size of char_array1 : "+ char_array2.size());
        System.out.println("Size of char_array1 : "+ char_array3.size());

    }


}
