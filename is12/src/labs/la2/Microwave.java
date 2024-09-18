package labs.la2;

public class Microwave {

    private int time = 600; // Текущее время в секундах (по умолчанию 10 минут)
    private int power = 1; // Уровень мощности (по умолчанию 1)

    /**
     * Запускает процесс приготовления и уменьшает оставшееся время на 1 секунду.
     */
    public void start() {
        time -= 1;
        System.out.println("Приготовление в течение " + time + " секунд на уровне " + power);
    }

    /**
     * Сбрасывает время и уровень мощности микроволновки до начальных значений.
     */
    public void reset() {
        time = 0;
        power = 1;
    }

    /**
     * Переключает уровень мощности микроволновки между 1 и 2.
     *
     * @return power - мощность
     */
    public int powerSwitch() {
        power = (power == 1) ? 2 : 1;
        return power;
    }

    /**
     * Добавляет к текущему времени заданное количество секунд.
     */
    public void timeAdd() {
        int addedTime = 30; // Количество времени для добавления (в секундах)
        time += addedTime; // Увеличиваем текущее время на 30 секунд
        System.out.println("Увеличение времени на " + addedTime + " секунд");
    }
}