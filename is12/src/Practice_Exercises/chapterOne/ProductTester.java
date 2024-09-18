package Practice_Exercises.chapterOne;

/**
 *Task 14
 */
public class ProductTester
{
    public static void main (String[] args)
    {
        Product toaster = new Product("Toaster", 29.95);
        Product phone = new Product("Phone", 399.99);

        System.out.println("First Product: ");
        System.out.print("Name: " + toaster.getName() + " Price: " + toaster.getPrice());
        System.out.println();

        //Price reduction
        toaster.reducePrice(5);

        System.out.println("Price reduction First Product: ");
        System.out.print("Name: " + toaster.getName() + " Price: " + toaster.getPrice());
        System.out.println();

        System.out.println("Second Product: ");
        System.out.print("Name: " + phone.getName() + " Price: " + phone.getPrice());

        System.out.println();
        //Price reduction
        phone.reducePrice(5);
        System.out.println("Second Product: ");
        System.out.print("Name: " + phone.getName() + " Price: " + phone.getPrice());


    }
}
