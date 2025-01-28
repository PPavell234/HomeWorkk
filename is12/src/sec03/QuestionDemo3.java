package sec03;

import java.util.Scanner;

public class QuestionDemo3 {
    public static void main(String[] args) {
        Question first = new Question();
        first.setText("Who was the invetor of java");
        first.setAnswer("James Gosling");


        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("Who was the invetor of java2");
        second.addChoice("1", true);
        second.addChoice("2", false);
        second.addChoice("3", true);

        presentQuestion(first);
        presentQuestion(second);


    }

    public static void presentQuestion(Question q){
        q.display();
        System.out.println("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
