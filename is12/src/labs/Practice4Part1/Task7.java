package labs.Practice4Part1;

public class Task7 {

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


    }
}
