package Practice_Exercises.chapterTwo;

/**
 *Task 9
 */

public class BatteryTester
{
    public static void main(String[] args)
    {
        Battery aa = new Battery(5000);

        aa.drain(120);
        aa.drain(420);

        System.out.println(aa.getRemainingCapacity());
        System.out.println("Expected: 4460");

        // Перезаряжаем аккумулятор
        aa.charge();
        System.out.println(aa.getRemainingCapacity());
        System.out.println("Expected: 5000");
    }
}
