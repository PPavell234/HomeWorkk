package Papka;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class TestTest {

    private int hashCode;
    private String name;

    public TestTest(int hashCode, String name) {
        this.hashCode = hashCode;
        this.name = name;
    }

    public static void main(String[] args) {
        int fromIndex = 5;
        int size = 5;
        int length = 15;
        int objectInt = 12;
        TestTest test = new TestTest(12,"Pavel");


     /*   Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.append("Приввет саша ");

        System.out.println("Hello " + name);*/

     /*   Scanner sc2 = new Scanner(new File("myNumbers"));
        while (sc2.hasNextLong()) {
            long aLong = sc2.nextLong();
        }*/

        System.out.println(Objects.checkFromIndexSize(fromIndex, size, length));
        System.out.println(test.hashCode);


    }
}
