package Exercises5;

public class PrintTable {


    public static void main(String[] args) {
        PrintTable pt = new PrintTable();
        System.out.println(pt.createTable(10000, 10000));

    }

    public int createTable(int rows, int columns) {
        // Вывод "x x x" один раз в начале
        for (int j = 1; j <= columns; j++) {
            // Выравнивание по центру "x"
            System.out.print(String.format("%4s", "x"));
        }
        System.out.println(); // Переход на новую строку

        // Вывод таблицы "Numer"
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                int number = i * j;
                // Выравнивание по центру чисел
                System.out.print(String.format("%4d ", number));
            }
            System.out.println();
        }
        return 0;
    }
}