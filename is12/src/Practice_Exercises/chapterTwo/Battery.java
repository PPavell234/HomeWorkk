package Practice_Exercises.chapterTwo;

/**
 * Task 9
 */

public class Battery {

    private double currentCapacity; // The current capacity of the battery.
    private double batteryCapacity; // The maximum capacity of the battery.


    /**
     * Constructs a battery object with a given capacity
     *
     * @param capacity
     */
    public Battery(double capacity) {
        batteryCapacity = capacity;
        currentCapacity = capacity;
    }


    /**
     * Drains the object battery by given amount
     *
     * @param amount milliampere hours to drain
     */
    public void drain(double amount) {
        currentCapacity = currentCapacity - amount;
    }

    /**
     * Recharges the battery to full capacity
     */
    public void charge() {
        currentCapacity = batteryCapacity;
    }

    /**
     * Gets the battery capacity
     *
     * @return battery capacity
     */
    public double getRemainingCapacity() {
        return currentCapacity;
    }
}
