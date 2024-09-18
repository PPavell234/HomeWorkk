package Practice_Exercises.chapterTwo;

/**
 * Task 10
 */
public class RoachSimulation {
    public static void main(String[] args) {
        // Создаем объект RoachPopulation с начальным населением 1000 тараканов
        RoachPopulation roachPopulation = new RoachPopulation(1000);

        // Выводим начальное население
        System.out.println("Начальное население тараканов: " + roachPopulation.getRoachPopulation());

        // Проводим размножение и выводим измененное население
        roachPopulation.breed();
        System.out.println("После размножения: " + roachPopulation.getRoachPopulation());

        // Проводим опрыскивание населения и выводим измененное население
        roachPopulation.spray(50); // Уменьшаем на 50%
        System.out.println("После опрыскивания: " + roachPopulation.getRoachPopulation());
    }



}
