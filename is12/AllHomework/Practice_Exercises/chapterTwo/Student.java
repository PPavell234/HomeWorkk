package Practice_Exercises.chapterTwo;

/**
 *Task 8
 */

public class Student {

    private String name;
    private double totalScore;
    private double quizNumber;

    public Student(String stuName) {

        name = stuName;
        totalScore = 0;
        quizNumber = 0;
    }

    public void addQuiz(double score) {

        totalScore = totalScore + score;
        quizNumber = quizNumber + 1;

    }

    public double getTotalScore() {

        return totalScore;

    }

    public double getAverage() {

        return totalScore / quizNumber;
    }

}
