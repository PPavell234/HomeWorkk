package labs.Practice3part1;

public class IceCreamCone {


    private final int radius;
    private final int height;

    public IceCreamCone(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }


    public double getSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}

