package Practice_Exercises.chapterOne;

public class Bug {
    private int currentPosition;
    private int xPosition = 1;  // Signifies moving 1 in the x-axis


    /**
     * Constructs a object bug at a given position
     *
     * @param initialPosition initial position
     */
    public Bug(int initialPosition) {
        currentPosition = initialPosition;
    }


    /**
     * Turns the bug around (x-axis)
     */
    public void turn() {
        xPosition = xPosition * -1;
    }

    /**
     * Moves the bug one space
     */
    public void move() {
        currentPosition = currentPosition + xPosition;
    }

    /**
     * Gets the current position of the bug
     *
     * @return current position
     */
    public int getPosition() {
        return currentPosition;
    }
}