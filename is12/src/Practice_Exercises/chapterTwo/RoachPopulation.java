package Practice_Exercises.chapterTwo;

/**
 *Task 10
 */
public class RoachPopulation {
    private double populationSize;

    // Конструкторы
    /**
     * Создает объект RoachPopulation с заданным начальным населением
     * @param initialPop начальное население
     */
    public RoachPopulation(int initialPop) {
        populationSize = initialPop;
    }

    // Методы
    /**
     * Размножает население тараканов и удваивает его размер
     */
    public void breed() {
        populationSize *= 2;
    }

    /**
     * Уменьшает население на определенный процент
     * @param byPercent процент для уменьшения
     */
    public void spray(double byPercent) {
        double percent = byPercent / 100.0;
        populationSize -= populationSize * percent;
    }

    /**
     * Получает количество тараканов в населении
     * @return количество тараканов
     */
    public double getRoachPopulation() {
        return populationSize;
    }
}
