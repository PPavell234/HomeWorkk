package NewLab;

/**
 * Класс RoachPopulation представляет собой модель популяции тараканов с возможностью размножения и обработки инсектицидами.
 */
public class RoachPopulation {
    /**
     * Начальное количество тараканов
     */
    private int initialStage;

    /**
     * Конечное количество тараканов
     */
    private int finalStage;

    /**
     * Конструктор, инициализирующий объект RoachPopulation с указанным начальным количеством тараканов.
     *
     * @param initialStage начальное количество тараканов
     */
    public RoachPopulation(int initialStage) {
        this.initialStage = initialStage;
    }

    /**
     * Метод breed() удваивает количество тараканов в популяции.
     *
     * @return конечное количество тараканов после размножения
     */
    public int breed() {
        finalStage = initialStage * 2;
        System.out.println("Данная популяция прибавилась в " + finalStage);
        return finalStage;
    }

    /**
     * Метод spray() уменьшает количество тараканов в популяции на указанный процент при помощи инсектицидов.
     *
     * @param percent процент тараканов, подлежащих уменьшению
     * @return количество тараканов, подвергнутых обработке инсектицидами
     */
    public double spray(double percent) {
        double number;
        percent = (percent / 100) * finalStage;

        System.out.println("Популяция тараканов уменьшилась на " + percent + "% процентов");

        return percent;
    }

    /**
     * Метод getRoacher() возвращает текущее количество тараканов в популяции.
     *
     * @return текущее количество тараканов в популяции
     */
    public int getRoacher() {
        return finalStage;
    }
}