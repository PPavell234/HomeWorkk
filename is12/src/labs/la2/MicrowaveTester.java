package labs.la2;

public class MicrowaveTester {
    public static void main(String[] args) {
        Microwave microwave = new Microwave();

        microwave.start();
        microwave.start();
        microwave.timeAdd();
        microwave.powerSwitch();
        microwave.start();
        microwave.timeAdd();
        microwave.timeAdd();
        microwave.start();
    }
}
