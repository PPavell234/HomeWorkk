package sec03;

import java.util.Scanner;

public class QuestionDemo2 {
    public static void main(String[] args) {

        ChoiceQuestion firts = new ChoiceQuestion();
        firts.setText("What was the original name");
        firts.addChoice("*4", false);
        firts.addChoice("*5", true);
        firts.addChoice("*6", false);

        presentQuestion(firts);


    }

    public static void presentQuestion(ChoiceQuestion q) {
        q.display();
        System.out.println("Your answer ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
