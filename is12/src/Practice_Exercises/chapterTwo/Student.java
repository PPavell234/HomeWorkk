package Practice_Exercises.chapterTwo;

/**
 * Task 8
 */

public class Student {

    private String name; // The name of the student.
    private double totalScore; // The total score obtained by the student in quizzes.
    private double quizNumber; // The number of quizzes taken by the student.


    /**
     * Constructs a new Student object with the specified name.
     *
     * @param stuName The name of the student.
     */
    public Student(String stuName) {

        name = stuName;
        totalScore = 0;
        quizNumber = 0;
    }


    /**
     * Adds a quiz score to the total score of the student and increments the quiz count.
     *
     * @param score The score obtained in the quiz to be added.
     */
    public void addQuiz(double score) {

        totalScore = totalScore + score;
        quizNumber = quizNumber + 1;

    }


    /**
     * Retrieves the total score obtained by the student in all quizzes.
     *
     * @return The total score of the student.
     */

    public double getTotalScore() {

        return totalScore;

    }

    /**
     * Calculates and retrieves the average score obtained by the student in quizzes.
     *
     * @return The average score of the student.
     * @throws ArithmeticException if the student has not taken any quizzes (division by zero).
     */

    public double getAverage() {

        return totalScore / quizNumber;
    }

}
