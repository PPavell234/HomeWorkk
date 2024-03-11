package Practice_Exercises.chapterTwo;


/**
 * Task 3
 */

public class Balloon {

    private double radius; // The radius of the balloon.
    private double volumn; // The radius of the balloon.

    /**
     * Constructs a new Balloon object with the specified radius.
     *
     * @param radius The initial radius of the balloon.
     */
    public Balloon(double radius) {

        this.radius = radius;
        volumn = Math.PI * this.radius * this.radius * this.radius;

    }

    /**
     * Increases the radius of the balloon by the specified amount and recalculates the volume.
     *
     * @param amount The amount by which to inflate the balloon.
     */

    public void inflat(double amount) {
        this.radius = this.radius + amount;
        volumn = Math.PI * radius * radius * radius;

    }

    /**
     * Gets the current volume of the balloon.
     *
     * @return The volume of the balloon.
     */

    public double getVolumn() {

        return volumn;

    }

}
