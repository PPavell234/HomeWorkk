package Papka;

import java.util.*;

public class TestTest implements Mess {

    private int hashCode;
    private String name = "35345";

    public TestTest(int hashCode, String name) {
        this.hashCode = hashCode;
        this.name = name;
    }

    public static void main(String[] args) {
        Tester1 newTester = new Tester1();
        TestTest newTester2 = null;
        String name2 = "";

        String name = null;
        int fromIndex = 5;
        int size = 5;
        int length = 15;
        int objectInt = 12;
        Scanner well = new Scanner(System.in);
        TestTest test = new TestTest(12, "Pavel");

    


     /*   Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.append("Приввет саша ");

        System.out.println("Hello " + name);*/

     /*   Scanner sc2 = new Scanner(new File("myNumbers"));
        while (sc2.hasNextLong()) {
            long aLong = sc2.nextLong();
        }*/


        SimpleTimeZone timeZone = new SimpleTimeZone(15, "UTC");
        System.out.println(Objects.checkFromIndexSize(fromIndex, size, length));
        System.out.println(test.hashCode);
        System.out.println(String.valueOf(timeZone));


    }

    public String printNameof() {
        return getName();
    }


    @Override
    public String getName() {
        return name;
    }
}
