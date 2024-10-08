package labs.Practice4Part2;

import java.util.Scanner;

public class Task6 {

    public enum GNumber {
        L(1),
        V(2);

        private final int num;

        GNumber(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputNumber = scanner.nextInt(); // Считываем число

        Task6 task = new Task6();
        task.printRomanDigits(inputNumber);
    }

    public void printRomanDigits(int number) {
        // Проверка на допустимый диапазон
        if (number < 1 || number > 3999) {
            System.err.println("Число должно быть в диапазоне от 1 до 3999.");
            return;
        }

        // Преобразуем число в строку для перебора цифр
        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length(); i++) {
            char digit = numberString.charAt(i);
            String romanDigit = convertToRoman(digit - '0');
            System.out.print(romanDigit + " ");
        }
        System.out.println();
    }

    public String convertToRoman(int num) {
        switch (num) {
            case 1:
                return "L";
            case 2:
                return "V";
            default:
                return "Неверное число";
        }
    }
}