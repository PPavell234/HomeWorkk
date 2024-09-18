package Chatpter4;

public class Pyramid {
    private final double heigh;
    private final double baseLength;


    public Pyramid(double heigh, double baseLength) {
        this.heigh = heigh;
        this.baseLength = baseLength;
    }

    public double getVolume() {
        return (double) ((heigh * baseLength * baseLength) / 3);
    }

    public double getSurfaceArea() {
        double sideLenght = Math.sqrt(heigh * heigh + baseLength * baseLength / 4);
        return 2 * baseLength * sideLenght;
    }


}
