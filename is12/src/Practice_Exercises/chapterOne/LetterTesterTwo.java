/*

package Practice_Exercises;

public class LetterTesterTwo {
    public static String From()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter sender's name: ");
        String from = "\n\nSincerely, \n\n" + kb.nextLine() + ".";
        return from;
    }

    public static String getText()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter three lines of text: ");
        String line = "";
        for(int i = 0; i<3; i++)
        {
            line = line.concat("\n" + kb.nextLine());

        }
        return line;
    }

    public static String To()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter recipient's name: ");
        String to = "\n\nDear " + kb.nextLine() + ",\n";
        return to;
    }


    public static void main(String[] args)
    {
        LetterTwo message = new LetterTwo("Foler","Kokola");
        String Footer = From();

        System.out.print(Header + Body + Footer);
    }
}
*/
