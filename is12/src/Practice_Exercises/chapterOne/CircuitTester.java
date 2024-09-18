package Practice_Exercises.chapterOne;


public class CircuitTester {

    public static void main(String[] args) {

        Circuit light = new Circuit();

        light.toggleSwitch(1);
        light.toggleSwitch(2);
        light.toggleSwitch(1);

        System.out.println("Состояние лампы :");
        System.out.println(light.getLampState());
        System.out.println("Состояние переключателя1 :");
        System.out.println(light.getSwtitchState(1));
        System.out.println("Состояние переключателя2 :");
        System.out.println(light.getSwtitchState(2));

    }

}
