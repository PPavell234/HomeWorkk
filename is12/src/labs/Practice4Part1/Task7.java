package labs.Practice4Part1;

public class Task7 {
    /**
     * Метод CheckAscending проверяет, находятся ли три числа в порядке возрастания,
     * порядке убывания или не упорядочены.
     *
     * <p>Если первое число меньше второго, а третье число больше второго, * то числа находятся в порядке возрастания. Если первое число больше второго,
     * а второе больше третьего, то числа находятся в порядке убывания.
     * В противном случае числа не упорядочены.</p>
     *
     * @param numberOne первое число для проверки
     * @param numberTwo второе число для проверки * @param numberThree третье число для проверки * @return строка с сообщением о порядке чисел
     */
    public String CheckAscending(int numberOne, int numberTwo, int numberThree) {
        if (numberOne < numberTwo && numberThree > numberTwo) {
            return ("Числа в порядке возрастания");
        } else if (numberOne > numberTwo && numberTwo > numberThree) {
            return ("Числа в порядке убывания");
        } else {
            return ("Числа не в порядке возрастания и не в порядке убывания");
        }
    }



    public static void main(String[] args) {

        Task7 obj = new Task7();
        System.out.println(obj.CheckAscending(1, 2, 3));
        System.out.println(obj.CheckAscending(10, 9, 8));
        System.out.println(obj.CheckAscending(10, 10, 8));
        System.out.println(obj.CheckAscending(-10, 10, 8));
        System.out.println(obj.CheckAscending(3, 4, 4));


    }
}
