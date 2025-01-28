package sec03;

import java.util.Scanner;

public class Question {
    private String text;
    private String answer;


    public Question() {
        text = "";
        answer = "";
    }

    public void setText(String qurstionText) {
        text = qurstionText;
    }

    public void setAnswer(String correctAnswer) {
        answer = correctAnswer;
    }

    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }

    public void display() {
        System.out.println(text);
    }

    public void presentQuestion(){
        this.display();
        System.out.println("Your answer ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(this.checkAnswer(response));
    }

}
