package Practice_Exercises.Codewars;

import Practice_Exercises.chapterOne.Circuit;

public class CircuitTester {


    public static void main(String[] args) {

        Practice_Exercises.chapterOne.Circuit light = new Circuit();

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

