package NewLab;

public class BatteryTesterT {

    public static void main(String[] args) {
        BatteryT batteryOne = new BatteryT(2900);
        System.out.println("Начальная емкость батареи: " + batteryOne.getRemainingCapacity());


        batteryOne.drain(100);

        batteryOne.charge();

        System.out.println("Оставшаяся емкость батареи после зарядки: " + batteryOne.getRemainingCapacity());


    }
}
