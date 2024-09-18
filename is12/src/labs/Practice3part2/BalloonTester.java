package labs.Practice3part2;

public class BalloonTester {
    public static void main(String[] args) {
        Balloon balloon = new Balloon();


        System.out.println("1 Добавления 100cm^3 воздуха:");
        balloon.addAir(100);

        System.out.printf("Радиус: %.3f\n", balloon.getRadius());
        System.out.printf("Объем: %.3f\n", balloon.getVolume());
        System.out.printf("Площадь поверхности: %.3f\n", balloon.getSurfaceArea());

        System.out.println();

        System.out.println("2 Добавления 100cm^3 воздуха:");
        balloon.addAir(100);

        System.out.printf("Радиус: %.3f\n", balloon.getRadius());
        System.out.printf("Объем: %.3f\n", balloon.getVolume());
        System.out.printf("Площадь поверхности: %.3f\n", balloon.getSurfaceArea());

        System.out.println();

        System.out.println("3 Добавления 100cm^3 воздуха:");
        balloon.addAir(100);

        System.out.printf("Радиус: %.3f\n", balloon.getRadius());
        System.out.printf("Объем: %.3f\n", balloon.getVolume());
        System.out.printf("Площадь поверхности: %.3f\n", balloon.getSurfaceArea());


    }
}