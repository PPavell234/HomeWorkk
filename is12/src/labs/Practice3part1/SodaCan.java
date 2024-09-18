package labs.Practice3part1;

public class SodaCan {

    private int height;
    private int diameter;


    public SodaCan(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }

    public double getVolume() {
        return Math.PI * Math.pow(diameter / 2.0, 2) * height;
    }


    public double getSurfaceArea() {
        return (2 * Math.PI * ((double) diameter / 2) * height) + (2 * Math.PI * Math.pow(((double) diameter / 2), 2));
    }
}
