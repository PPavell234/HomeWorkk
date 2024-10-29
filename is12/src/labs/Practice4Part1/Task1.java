package labs.Practice4Part1;

import labs.Practice3part1.SodaCan;

public class Task1 {
    private String track = "abcdefgh";

    /**
     * Определяет цвет клетки шахматной доски по ее координате.
     *
     * @param track       Название столбца (от a до h).
     * @param numberChest Номер строки (от 1 до 8).
     * @return "White" - если клетка белая, "Black" - если клетка черная,
     * "Неправельный диапазон" - если номер строки не в диапазоне от 1 до 8,
     * "Неправильная строка должна быть от a до h" - если название столбца не от a до h.
     */
    public String getColor(String track, String numberChest) {
        if (Integer.parseInt(numberChest) < 1 || Integer.parseInt(numberChest) > 8) {
            return "Неправельный диапазон";
        }

        if (!this.track.contains(track)) {
            return "Неправильная строка должна быть от a до h";
        }

        int sum = this.track.indexOf(track) + Integer.parseInt(numberChest);

        if (sum % 2 == 0) {
            return "White";
        } else {
            return "Black";
        }
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.getColor("d", "2"));
        System.out.println(task1.getColor("g", "5"));
        System.out.println(task1.getColor("t", "5"));
        System.out.println(task1.getColor("g", "6"));
    }
}