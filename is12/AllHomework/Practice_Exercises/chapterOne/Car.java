package Practice_Exercises.chapterOne;

/**
 *Task 13
 */

public class Car
{
    int mpg;
    double fuel;

    // Constructors
    public Car(int mpg)
    {
        this.mpg = mpg;
        fuel = 0;
    }

    // Methods
    public void addGas(double gallons)
    {
        fuel = fuel + gallons;
    }

    public double getGasInTank()
    {
        return fuel;
    }

    public void drive(int miles)
    {
        double gallonsUsed = miles / mpg;
        fuel = fuel - gallonsUsed;
    }
}