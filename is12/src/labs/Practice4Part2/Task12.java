package labs.Practice4Part2;

import labs.Practice4Part2.Task11.Task11;

public class Task12 {
    private double rIsZero = 100; // Исправлено на правильное имя
    private double coefficient = 0.5; // Исправлено на латинскую букву 'c'
    private double resistance;
    private double resistanceS = 75;
    private double voltageS = 20;//
    private final int Vmin = 12;
    private final int Vmax = 18;


    public double voltmeter(double Vm) {
        if (Vmin <= Vm && Vm <= Vmax) {
            double temperatureGas = ((resistanceS / coefficient) * (Vm / (voltageS - Vm))) - (rIsZero / coefficient);
            double resistance = rIsZero + coefficient * temperatureGas;

            return Math.ceil(temperatureGas);
        } else {
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Task12 g = new Task12();


        System.out.println("Темперутура в градусах цельсия равна " + g.voltmeter(13));
    }
}
