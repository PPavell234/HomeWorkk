package labs.la2;

import java.math.BigInteger;

public class Biglnteger {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("12345678987654321");
        System.out.println("числа с произвольным количеством цифрчисла с произвольным количеством цифр -> a: "+a);


        BigInteger aSquared = a.pow(2);
        System.out.println("Вторая степень числа a: " + aSquared);


        BigInteger aToTheFourth = a.pow(4);
        System.out.println("Четвертая степень числа a: " + aToTheFourth);


        BigInteger aToTheEighth = a.pow(8);
        System.out.println("Восьмая степень числа a: " + aToTheEighth);
    }
}

