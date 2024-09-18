package labs.Practice3part1;

public class SodaCanTester {
    public static void main(String[] args) {
        SodaCan can = new SodaCan(5, 6);

        System.out.printf("Объем банки : %.2f\n", can.getVolume());
        System.out.printf("Площадь газировки: %.2f\n", can.getSurfaceArea());
    }
}
