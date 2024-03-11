package Practice_Exercises.chapterTwo;

/**
 * Task 13
 */

public class Car {
    int mpg; // Miles per gallon (fuel efficiency) of the car.
    double fuel; // Current fuel level of the car.

    /**
     * Constructs a new Car object with the specified fuel efficiency.
     *
     * @param mpg The fuel efficiency of the car in miles per gallon.
     */
    public Car(int mpg) {
        this.mpg = mpg;
        fuel = 0; // Initializing fuel level to 0.
    }

    /**
     * Adds the specified amount of gas to the fuel tank of the car.
     *
     * @param gallons The amount of gas to be added to the fuel tank.
     */
    public void addGas(double gallons) {
        fuel = fuel + gallons;
    }

    /**
     * Retrieves the current amount of gas in the fuel tank of the car.
     *
     * @return The current amount of gas in the fuel tank.
     */

    public double getGasInTank() {
        return fuel;
    }


    /**
     * Simulates driving the car for the specified number of miles.
     * It calculates the amount of fuel consumed based on the car's fuel efficiency (mpg).
     *
     * @param miles The number of miles to be driven.
     */
    public void drive(int miles) {
        double gallonsUsed = miles / mpg;
        fuel = fuel - gallonsUsed;
    }
}

