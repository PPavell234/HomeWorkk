package labs.Practice3part1;

public class IceCreamConeTester {
    public static void main(String[] args) {
        IceCreamCone iceCreamCone = new IceCreamCone(3, 5);

        System.out.printf("Площадь мороженого: %.2f\n", iceCreamCone.getSurfaceArea());
        System.out.printf("Объем мороженого : %.2f\n", iceCreamCone.getVolume());


    }
}
