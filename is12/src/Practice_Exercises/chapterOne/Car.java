package Practice_Exercises.chapterOne;

/**
 * Task 13
 */

public class Car {
    int mpg;
    double fuel;

    /**
     * Constructs a car object with the specified miles per gallon.
     * Initializes the fuel level to 0 gallons.
     *
     * @param mpg The miles per gallon of the car.
     */
    public Car(int mpg) {
        this.mpg = mpg; // Miles per gallon
        fuel = 0; // Current fuel level in gallons
    }

    /**
     * Adds the specified amount of fuel to the car's fuel tank.
     *
     * @param gallons The number of gallons to add to the fuel tank.
     */
    public void addGas(double gallons) {
        fuel = fuel + gallons;
    }


    /**
     * Returns the current amount of gas in the car's fuel tank.
     *
     * @return The current amount of gas in the fuel tank, in gallons.
     */

    public double getGasInTank() {
        return fuel;
    }

    /**
     * Simulates driving the car for the specified number of miles.
     * Reduces the fuel level based on the miles driven and the car's miles per gallon.
     *
     * @param miles The number of miles to drive.
     */

    public void drive(int miles) {
        double gallonsUsed = miles / mpg;
        fuel = fuel - gallonsUsed;
    }
}