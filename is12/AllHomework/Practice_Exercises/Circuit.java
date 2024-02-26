package Practice_Exercises;

public class Circuit {
    private int firstSwitch;
    private int secondSwitch;
    private int combineSwitch;
    private int lampState;

    /**
     * Constructor. Initialize a key variable: combineSwitch
     */
    public Circuit() {

        firstSwitch = 0;
        secondSwitch = 0;
        combineSwitch = 0;
        lampState = 0;

    }

    /**
     * Toggle one of 2 switches, based on parameter switchID: 1 = switch#1, 2 =
     * switch#2.
     *
     * @param switchID 1 = switch#1, 2 = switch#2.
     * @variable firstSwith store state of switch#1, 1 = on, 0 =off;
     * @variable secondSwith store state of switch#2, 1 = on, 0 = off;
     * @variable combineSwitch TWO figure number, tens store the state of switch#2,
     * digits store the state of switch #1;
     * @variable lampState store state of lamp, 1 = on, 0 =off.
     */

    public void toggleSwitch(int switchID) {

        firstSwitch = (firstSwitch + switchID) % 2;
        secondSwitch = (secondSwitch + switchID + 1) % 2;
        combineSwitch = firstSwitch + secondSwitch * 10;
        lampState = (lampState + 1) % 2;

    }

    /**
     * Get the state of one of switches, based on switchID: 1 = switch#1, 2 =
     * switch#2.
     *
     * @param switchID 1 = switch#1, 2 = switch#2
     * @return state of one of switches, based on switchID: 1 = switch#1, 2 =
     * switch#2.
     */

    public int getSwtitchState(int switchID) {

        int power2 = (int) Math.pow(10, switchID);
        int power1 = (int) Math.pow(10, switchID - 1);

        int switchState = Math.floorDiv(combineSwitch % power2, power1);
        return switchState;

    }

    /**
     * Get the state of Lamp: 1 = on, 0 = off.
     *
     * @return the state of Lamp: 1 = on, 0 = off.
     */

    public int getLampState() {

        return lampState;

    }

}

