package Practice_Exercises.chapterOne;

public class MothTester {
    public static void main(String[] args) {
        Moth moth = new Moth(100);

        moth.moveToLight(5);

        System.out.println(moth.getPosition());
        System.out.println("Expected: 102,5");

        moth.moveToLight(345);

        System.out.println(moth.getPosition());
        System.out.println("Expected: 275,0");
    }
}