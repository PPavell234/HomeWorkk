package labs.Practice4Part2;

public class task13 {

    private double thermistor;
    private boolean singal = false;
    private double R0 = 33192;
    private double R;
    private double MATERIALB = 3310; //Прибавить еще к ней 273
    private double temperatureT0 = 40;
    private double temperatureT;
    private double R1, R2, R3, R4 = 156300;
    private double KELVIN_TEMPERATURE = 273;
    private double ELECTROMOTIVE_FORCE = 8.85 * Math.pow(10, -12);
    //Electromotive force - Wikipedia


    public String checkingTemperature(double temperature) {
        this.temperatureT = temperature;

        R = R0 * Math.pow(ELECTROMOTIVE_FORCE, MATERIALB * ((1 / (temperature + KELVIN_TEMPERATURE)) - (1 / (temperatureT0 + KELVIN_TEMPERATURE))));
        // Проверка на деление на ноль
        if (R == 0) {
            throw new IllegalArgumentException("R не может быть равно нулю.");
        }
        if (FrostAlarm()) {
            return "Тривога";
        }
        return "Тривоги нету";
    }


    private boolean FrostAlarm() {
        if ((R2 / R + R2) < (R4 / R3 + R4)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        task13 t = new task13();

        System.out.println(t.checkingTemperature(200));


    }
}
