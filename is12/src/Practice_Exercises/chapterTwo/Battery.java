package Practice_Exercises.chapterTwo;

/**
 * Task 9
 */

public class Battery {

    private double currentCapacity; // Текущая емкость аккумулятора.
    private double batteryCapacity; // Максимальная емкость аккумулятора.

    /**
     * Создает объект аккумулятора с заданной емкостью.
     *
     * @param capacity Емкость аккумулятора.
     */
    public Battery(double capacity) {
        batteryCapacity = capacity;
        currentCapacity = capacity;
    }

    /**
     * Разряжает аккумулятор на указанное количество емкости.
     *
     * @param amount Количество миллиампер-часов для разряда.
     */
    public void drain(double amount) {
        currentCapacity -= amount;
    }

    /**
     * Заряжает аккумулятор до максимальной емкости.
     */
    public void charge() {
        currentCapacity = batteryCapacity;
    }

    /**
     * Возвращает оставшуюся емкость аккумулятора.
     *
     * @return Оставшаяся емкость аккумулятора.
     */
    public double getRemainingCapacity() {
        return currentCapacity;
    }
}