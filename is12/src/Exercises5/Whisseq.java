package Exercises5;

public class Whisseq {
    public static void main(String[] args) {

        {
            int a = 5;
            System.out.println(a-- - --a + ++a + a++ + a);
        }

        {
            int b = 8;
            System.out.println(++b - b++ + ++b - --b);
        }


    }
}
