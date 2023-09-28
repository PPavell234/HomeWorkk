package Exercises3;

public class HomeWork4 {
    public static void main(String[] args) {
        long decimalLong = 123456789L; // Десятичная система счисления
        long binaryLong = 0b111010110111100110100010101L; // Двоичная система счисления (префикс 0b)
        long octalLong = 0726746425L; // Восьмеричная система счисления (префикс 0)
        long hexadecimalLong = 0x75BCD15L; // Шестнадцатеричная система счисления (префикс 0x)

        System.out.println("Десятичная: " + decimalLong);
        System.out.println("Двоичная: " + binaryLong);
        System.out.println("Восьмеричная: " + octalLong);
        System.out.println("Шестнадцатеричная: " + hexadecimalLong);
    }
}
