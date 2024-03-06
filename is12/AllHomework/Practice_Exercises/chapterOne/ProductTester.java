package Practice_Exercises.chapterOne;

/**
 *Task 14
 */
public class ProductTester
{
    public static void main (String[] args)
    {
        Product tv = new Product("Sony Bravia", 771.99);
        Product game = new Product("Sony PS4", 399.99);

        System.out.println("First Product: ");
        System.out.print("Name: " + tv.getName() + " Price: " + tv.getPrice());
        System.out.println();

        //Price reduction
        tv.reducePrice(5);

        System.out.println("Price reduction First Product: ");
        System.out.print("Name: " + tv.getName() + " Price: " + tv.getPrice());
        System.out.println();

        System.out.println("Second Product: ");
        System.out.print("Name: " + game.getName() + " Price: " + game.getPrice());

        System.out.println();
        //Price reduction
        game.reducePrice(5);
        System.out.println("Second Product: ");
        System.out.print("Name: " + game.getName() + " Price: " + game.getPrice());


    }
}
