package Practice_Exercises.chapterOne;

public class Circuit {
    private int firstSwitch;
    private int secondSwitch;
    private int combineSwitch;
    private int lampState;

    /**
     * Default constructor. Initializes the states of switches and lamp to 0.
     */
    public Circuit() {

        firstSwitch = 0;
        secondSwitch = 0;
        combineSwitch = 0;
        lampState = 0;

    }

    /**
     * Toggles the specified switch.
     *
     * @param switchID The ID of the switch to toggle (1 for the first switch, 2 for the second switch)
     */

    public void toggleSwitch(int switchID) {

        firstSwitch = (firstSwitch + switchID) % 2;
        secondSwitch = (secondSwitch + switchID + 1) % 2;
        combineSwitch = firstSwitch + secondSwitch * 10;
        lampState = (lampState + 1) % 2;

    }

    /**
     * Gets the state of the specified switch.
     *
     * @param switchID The ID of the switch to get the state of (1 for the first switch, 2 for the second switch)
     * @return The state of the specified switch (0 or 1)
     */


    public int getSwtitchState(int switchID) {

        int power2 = (int) Math.pow(10, switchID);
        int power1 = (int) Math.pow(10, switchID - 1);

        int switchState = Math.floorDiv(combineSwitch % power2, power1);
        return switchState;

    }

    /**
     * Gets the state of the lamp.
     *
     * @return The state of the lamp (0 or 1)
     */

    public int getLampState() {

        return lampState;

    }

}

