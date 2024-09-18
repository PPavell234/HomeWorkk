package labs.la2;

public class Student2 {

    private String name; // Имя студента.
    private double totalScore; // Общий балл, набранный студентом в тестах.
    private double allTest; // Количество всех тестов, пройденных студентом.

    /**
     * Создает новый объект Student2 с указанным именем студента.
     *
     * @param studentName Имя студента.
     */
    public Student2(String studentName) {
        name = studentName;
        totalScore = 0;
        allTest = 0;
    }

    /**
     * Добавляет результат теста к общему баллу студента и увеличивает счетчик тестов.
     *
     * @param score Результат теста для добавления.
     */
    public void test(double score) {
        totalScore += score;
        allTest++;
    }

    /**
     * Получает общий балл, набранный студентом во всех тестах.
     *
     * @return Ос
     */
    public double getTotalScore() {
        return totalScore;
    }

    /**
     * Вычисляет и возвращает средний балл студента по всем тестам.
     *
     * @return Средний балл студента..
     */
    public double getAverage() {
        return totalScore / allTest;
    }
}
