package Tester;

public class Balloon2 {

    private double radius = 0; // Текущий радиус шара.

    /**
     * Увеличивает радиус шара на указанную величину и выводит сообщение о его новом радиусе.
     *
     * @param amount Величина, на которую надувается шар.
     */
    public void inflate(double amount) {
        radius += amount;
        System.out.println("Шар надувается до радиуса " + radius);
    }

    /**
     * Вычисляет объем шара на основе его текущего радиуса и выводит сообщение о его объеме.
     *
     * @return Объем шара.
     */
    public double getVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Объем шара равен " + volume);
        return volume;
    }
}
