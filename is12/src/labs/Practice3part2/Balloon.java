package labs.Practice3part2;

public class Balloon {

    private double radius;
    private double volume;


    public Balloon() {
        volume = 0;
        radius = 0;
    }


    public void addAir(double amount) {
        volume = volume + amount;
        radius = Math.cbrt((volume) / ((4.0 / 3.0) * Math.PI));
    }


    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }


    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }


    public double getRadius() {
        return radius;
    }
}
