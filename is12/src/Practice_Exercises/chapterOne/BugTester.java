package Practice_Exercises.chapterOne;

public class BugTester {
    public static void main(String[] args) {
        Bug bugsy = new Bug(10);

        bugsy.move();
        bugsy.move();

        bugsy.turn(); //При повороте значения отнимаются в другую сторону

        bugsy.move();
        bugsy.move();
        bugsy.move();
        bugsy.move();

        bugsy.turn();

        bugsy.move();
        bugsy.move();


        System.out.println(bugsy.getPosition());
        System.out.println("Expected: 10");
    }
}
