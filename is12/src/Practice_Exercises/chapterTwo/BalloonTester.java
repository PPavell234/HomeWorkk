package Practice_Exercises.chapterTwo;

/**
 * Task 3
 */

public class BalloonTester {

    public static void main(String[] args) {

        Balloon balloon = new Balloon(10);

        System.out.println(balloon.getVolumn());
        System.out.println("Expected: " + Math.PI * 10 * 10 * 10);

        balloon.inflat(10);
        System.out.println(balloon.getVolumn());
        System.out.println("Expected: " + Math.PI * 20 * 20 * 20);

    }

}
