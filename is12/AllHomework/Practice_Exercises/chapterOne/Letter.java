package Practice_Exercises.chapterOne;

/**
 * Task 15
 */

public class Letter
{
    private String sender;
    private String recipient;
    private String text = "";

    // Constructors
    /**
     * Constructs a letter object with a sender and recipient names
     * @param from sender name
     * @param to recipient name
     */
    public Letter(String from, String to)
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



}
