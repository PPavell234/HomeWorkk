package sec03;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;


    public ChoiceQuestion() {
        choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean corrent) {
        choices.add(choice);
        if (corrent) {
            String choicesString = " " + choice.length();
            setAnswer(choicesString);
        }
    }

    public void display() {
        super.display();

        for (int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }

}
