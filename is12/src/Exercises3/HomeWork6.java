package Exercises3;

public class HomeWork6 {
    public static void main(String[] args) {
        // Способ 1: Прямое присвоение символа
        char charVar1 = 'A';

        // Способ 2: Присвоение символа по коду Unicode
        char charVar2 = 65; // 65 соответствует символу 'A' в таблице Unicode

        // Способ 3: Присвоение символа в шестнадцатеричной форме
        char charVar3 = '\u0041'; // 0041 соответствует символу 'A' в шестнадцатеричной системе Unicode

        // Вывод переменных на экран
        System.out.println("Способ 1: " + charVar1);
        System.out.println("Способ 2: " + charVar2);
        System.out.println("Способ 3: " + charVar3);
    }
}
