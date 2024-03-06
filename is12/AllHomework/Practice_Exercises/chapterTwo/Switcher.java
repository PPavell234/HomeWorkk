package Practice_Exercises.chapterTwo;

/**
 *Task 4
 */

public class Switcher {

    private int firstSwitch;
    private int secondSwitch;
    private int lampState;

    public Switcher() {
        firstSwitch = 0;
        secondSwitch = 0;
        lampState = 0;
    }

    public void toggleFirstSwitch() {

        firstSwitch = (firstSwitch + 1)%2;
        lampState = (lampState + 1)%2;
    }

    public void toggleSecondSwitch() {

        secondSwitch = (secondSwitch + 1)%2;
        lampState = (lampState + 1)%2;

    }

    public int getFirstSwitchState() {

        return firstSwitch;

    }

    public int getSecondSwitchState() {

        return secondSwitch;

    }

    public int getLampState() {

        return lampState;
    }


}
