package NewLab;

public class BatteryT {
    /**
     * Емкость батареи
     */
    private double capacity;

    /**
     * Количество заряда
     */
    private double amount;

    /**
     * Конструктор, инициализирующий объект батареи с указанной начальной емкостью.
     *
     * @param capacity начальная емкость батареи
     */
    public BatteryT(double capacity) {
        this.capacity = Math.max(2000, Math.min(3000, capacity));
    }

    /**
     * Разряжает батарею на указанное количество емкости.
     *
     * @param amount количество емкости, которое необходимо разрядить
     */
    public void drain(double amount) {
        capacity -= amount;
        System.out.println("Батарея разряжена до " + capacity);
    }

    /**
     * Заряжает батарею до максимальной емкости (3000).
     */
    public void charge() {
        capacity = 3000;
        System.out.println("Заряд батареи снова полный: " + capacity);
    }

    /**
     * Возвращает оставшуюся емкость батареи.
     *
     * @return оставшаяся емкость батареи
     */
    public double getRemainingCapacity() {
        return capacity;
    }
}
