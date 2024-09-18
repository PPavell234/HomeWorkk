package Practice_Exercises.chapterOne;


public class Counter {
    // Instance Variables
    private int value;
    private int limit;

    // Constructors

    /**
     * Creates a counter with initial count at 0
     */
    public Counter() {
        value = 0;
    }

    /**
     * Creates a counter with a supplied initial count
     *
     * @param count starting value of Counter object
     */
    public Counter(int count) {
        value = count;
    }



    /**
     * Gets the current value of the counter.
     *
     * @return the current value
     */
    public int getValue() {
        return value;
    }

    /**
     * Advances the counter by 1
     */
    public void click() {
        value++;
        value = Math.min(value, limit);
    }

    /**
     * Resets the counter to 0
     */
    public void reset() {
        value = 0;
    }

    /**
     * Retreats the counter by 1
     */
    public void undo() {
        value--;
        value = Math.max(value, 0);
    }

    /**
     * Sets a limit on the maximum number of advances of the Counter
     *
     * @param maximum Max value Counter can have
     */
    public void setLimit(int maximum) {
        limit = maximum;
    }


}