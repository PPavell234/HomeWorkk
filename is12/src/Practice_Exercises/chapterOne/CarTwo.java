package Practice_Exercises.chapterOne;

public class CarTwo {

    private int mpg;
    private double fuel;

    public CarTwo(int mpg) {
        this.mpg = mpg;
        fuel = 0;
    }

    public void addGas(double gallons) {
        fuel += gallons;
    }

    public double getGasInTank() {
        return fuel;
    }

    public void drive(int miles) {
        double litersUsed = miles * mpg / 100.0;
        fuel -= litersUsed;
    }
}

