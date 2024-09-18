package NewLab;

public class RoachPopulationTester {
    public static void main(String[] args) {
        System.out.println("Начальная популяция состовляет : 100 ");
        RoachPopulation onePopulation = new RoachPopulation(100);
        onePopulation.breed();
        onePopulation.spray(24);
    }
}
