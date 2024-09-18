package Practice_Exercises.chapterOne;

public class CounterTester
{
    public static void main (String[] args)
    {
        Counter click = new Counter();
        click.setLimit(500);

        click.click();
        click.click();
        click.click();
        click.click();

        System.out.println("Click: " + click.getValue());

        click.undo();

        System.out.println("Click: " + click.getValue());

        Counter clickfirst = new Counter();
        clickfirst.setLimit(3);

        // Click 16 times
        clickfirst.click();
        clickfirst.click();
        clickfirst.click();
        clickfirst.click();

        System.out.println("Counter: " + clickfirst.getValue());
    }


}