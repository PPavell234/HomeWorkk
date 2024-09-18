package labs.la2;

import java.util.Random;

public class LotteryPrinter {


    public static void main(String[] args) {

        System.out.println("Комбинаци");
        System.out.println("Первое число: " + new LotteryRandom().random());
        System.out.println("Второе число: " + new LotteryRandom().random());
        System.out.println("Третье число: " + new LotteryRandom().random());
        System.out.println("Четвёрое число: " + new LotteryRandom().random());
        System.out.println("Пятое число: " + new LotteryRandom().random());
        System.out.println("Шестое число: " + new LotteryRandom().random());

    }
}

class LotteryRandom{
    public int random() {

        return new Random().nextInt(33) + 2;

    }

}