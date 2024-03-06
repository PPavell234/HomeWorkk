package Practice_Exercises.chapterTwo;


/**
 *Task 5
 */


public class SwitcherTester {
    public static void main(String[] args) {

        Switcher newLight = new Switcher();

        newLight.toggleFirstSwitch();

        System.out.println(newLight.getFirstSwitchState());
        System.out.println(newLight.getSecondSwitchState());
        System.out.println(newLight.getLampState());
        System.out.println("Expected 1" + "\n");

        newLight.toggleSecondSwitch();
        System.out.println(newLight.getFirstSwitchState());
        System.out.println(newLight.getSecondSwitchState());
        System.out.println(newLight.getLampState());
        System.out.println("Expected 0" + "\n");


    }

}
