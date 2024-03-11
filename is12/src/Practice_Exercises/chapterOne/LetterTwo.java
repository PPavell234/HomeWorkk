package Practice_Exercises.chapterOne;

import java.util.Scanner;

public class LetterTwo {

    private String sender;
    private String recipient;
    private String text = "";

    // Constructors
    /**
     * Constructs a letter object with a sender and recipient names
     * @param from sender name
     * @param to recipient name
     */
    public LetterTwo(String from, String to)
    {
        this.sender = from;
        this.recipient = to;
    }

    // Methods
    /**
     * Adds a line to the letter and then makes a new line
     * @param line the message
     */
    public void addLine(String line)
    {
        text = text.concat(line + "\n");
    }

    /**
     * Gets the text of the letter
     * @return text
     */
    public String getText()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter three lines of text: ");
        for(int i = 0; i<3; i++)
        {
            text = text.concat("\n" + kb.nextLine());

        }
        return text;
    }


    /**
     * Gets the recipients name
     * @return recipient name
     */
    public String getRecipient()
    {
        return recipient;
    }

    /**
     * Gets the senders name
     * @return sender name
     */
    public String getSender()
    {
        return sender;
    }

    public static String From()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter sender's name: ");
        String from = "\n\nSincerely, \n\n" + kb.nextLine() + ".";
        return from;
    }

    public static String To()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter recipient's name: ");
        return "\n\nDear " + kb.nextLine() + ",\n";
    }

}
