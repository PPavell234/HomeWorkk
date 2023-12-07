package Exercises8;

import java.util.Arrays;

public class Sum {

    //Создаем статический метод,чтобы не создовать объект класса
    public static int sum(int... numbers) {
        //Arrays.stream(numbers).sum(); Метод возвращает сумму всех элементов массива введеных элементов -> int... numbers
        return Arrays.stream(numbers).sum();
    }


}

class Printer {
    public static void print(int sum) {
        System.out.println("Сумма: " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Сумма 0: " + Sum.sum());
        System.out.println("Сумма 1: " + Sum.sum(1));
        System.out.println("Сумма 2: " + Sum.sum(456, 345));
        System.out.println("Сумма 3: " + Sum.sum(345, 345, 345));
        System.out.println("Сумма 4: " + Sum.sum(45, 345, 34, 45));

    }
}
