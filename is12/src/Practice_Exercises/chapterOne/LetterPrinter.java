package Practice_Exercises.chapterOne;

public class LetterPrinter {
    public static void main(String[] args) {
        Letter letter = new Letter("Mary", "Person");

        letter.addLine("Dear John " + letter.getRecipient() + ":");
        letter.addLine("");
        letter.addLine("I am sorry we must part.");
        letter.addLine("I wish you all the best.");
        letter.addLine("");
        letter.addLine("Sincerely,");
        letter.addLine("");
        letter.addLine(letter.getSender());

        System.out.println(letter.getText());
    }
}
