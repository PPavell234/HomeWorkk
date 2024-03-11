package Practice_Exercises.chapterOne;

public class Moth {
    private double currentPosition;


    /**
     * Constructs a Moth object with a given initial position
     *
     * @param initialPosition initial position
     */
    public Moth(double initialPosition) {
        currentPosition = initialPosition;
    }


    /**
     * Moves the moth half the distance it is to the light
     *
     * @param lightPosition position of the light
     */
    public void moveToLight(double lightPosition) {
        currentPosition = currentPosition + (lightPosition / 2.0); //метод просто перемещает текущую позицию на половину расстояния к позиции света.
        // Так, если позиция света находится далеко от текущей позиции, объект переместится к свету, но только на половину этого расстояния.
    }

    /**
     * Gets the Moth's position
     *
     * @return
     */
    public double getPosition() {
        return currentPosition;
    }
}
