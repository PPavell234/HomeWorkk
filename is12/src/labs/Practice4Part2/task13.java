package labs.Practice4Part2;


public class task13 {


    private double R0 = 33192; // Начальное сопротивление термистора
    private double R; // Сопротивление термистора
    private double MATERIALB = 3310; // Константа для расчета
    private double temperatureT0 = 40; // Температура в градусах Цельсия для расчета
    private double temperatureT; // Текущая температура
    private double R1 = 156300, R2 = 156300, R3 = 156300, R4 = 156300; // Сопротивления для проверки тревоги
    private double KELVIN_TEMPERATURE = 273; // Конвертация в Кельвины
    private double ELECTROMOTIVE_FORCE = 8.85 * Math.pow(10, -12); // Электромоторная сила

    /**
     * Метод для проверки температуры и определения необходимости включения тревоги.
     *
     * @param temperature Температура в градусах Цельсия для проверки.
     * @return Строка, указывающая на наличие или отсутствие тревоги.
     * @throws IllegalArgumentException Если рассчитанное сопротивление R равно нулю.
     */
    public String checkingTemperature(double temperature) {
        this.temperatureT = temperature;

        R = R0 * Math.pow(ELECTROMOTIVE_FORCE, MATERIALB * ((1 / (temperature + KELVIN_TEMPERATURE)) - (1 / (temperatureT0 + KELVIN_TEMPERATURE))));

        // Проверка на деление на ноль
        if (R == 0) {
            throw new IllegalArgumentException("R не может быть равно нулю.");
        }
        if (FrostAlarm()) {
            return "Тревоги нету";
        }
        return "Тревога";
    }

    /**
     * Метод для проверки условия тревоги на основе сопротивления термистора.
     *
     * @return true, если необходимо включить тревогу; false в противном случае.
     */
    private boolean FrostAlarm() {
        if ((R2 / R + R2) < (R4 / R3 + R4)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        task13 t = new task13();

        System.out.println(t.checkingTemperature(200));
        System.out.println(t.checkingTemperature(-100));
    }
}