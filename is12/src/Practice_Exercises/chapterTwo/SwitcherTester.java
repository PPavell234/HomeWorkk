package Practice_Exercises.chapterTwo;


/**
 * Task 5
 */


public class SwitcherTester {
    public static void main(String[] args) {

        Switcher newLight = new Switcher();

        newLight.toggleFirstSwitch();

        System.out.println("Выводим состояния переключателей и лампы после включения первого переключателя");
        System.out.println("getFirstSwitchState Ожидаемое значение: true (1)");
        System.out.println("getSecondSwitchState Ожидаемое значение: false (0) ");
        System.out.println("getLampState Ожидаемое значение: true (1)");



        System.out.println(newLight.getFirstSwitchState());
        System.out.println(newLight.getSecondSwitchState());
        System.out.println(newLight.getLampState());
        System.out.println("Expected 1" + "\n");

        System.out.println("Выводим состояния переключателей и лампы после включения первого переключателя");
        System.out.println("getFirstSwitchState Ожидаемое значение: true (1)");
        System.out.println("getSecondSwitchState Ожидаемое значение: false (0) ");
        System.out.println("getLampState Ожидаемое значение: true (1)");

        newLight.toggleSecondSwitch();
        System.out.println(newLight.getFirstSwitchState());
        System.out.println(newLight.getSecondSwitchState());
        System.out.println(newLight.getLampState());
        System.out.println("Expected 0" + "\n");


    }

}
