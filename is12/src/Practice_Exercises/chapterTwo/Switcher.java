package Practice_Exercises.chapterTwo;

/**
 * Task 4
 */

public class Switcher {

    private int firstSwitch; //По умолчанию должно стоять 0
    private int secondSwitch;
    private int lampState;


    /**
     * Default constructor. Initializes the states of switches and lamp to 0.
     */
    public Switcher() {
        firstSwitch = 0;
        secondSwitch = 0;
        lampState = 0;
    }


    /**
     * The toggleFirstSwitch() method toggles the state of the first switch between 0 and 1.
     * It also toggles the state of the lamp according to the new states of the switches.
     */

    public void toggleFirstSwitch() {

        firstSwitch = (firstSwitch + 1) % 2; //меняет значение переменной secondSwitch между 0 и 1. %2 применяется для того,
        // чтобы ограничить значение в диапазоне от 0 до 1.
        lampState = (lampState + 1) % 2;
    }

    /**
     * The toggleSecondSwitch() method toggles the state of the second switch between 0 and 1.
     * It also toggles the state of the lamp according to the new states of the switches.
     */

    public void toggleSecondSwitch() {

        secondSwitch = (secondSwitch + 1) % 2;
        lampState = (lampState + 1) % 2;

    }


    /**
     * The getFirstSwitchState() method returns the current state of the first switch.
     * @return The state of the first switch (0 or 1)
     */

    public int getFirstSwitchState() {

        return firstSwitch;

    }

    /**
     * The getSecondSwitchState() method returns the current state of the second switch.
     * @return The state of the second switch (0 or 1)
     */

    public int getSecondSwitchState() {

        return secondSwitch;

    }

    /**
     * The getLampState() method returns the current state of the lamp.
     * @return The state of the lamp (0 or 1), corresponding to the states of both switches
     */

    public int getLampState() {

        return lampState;
    }


}
