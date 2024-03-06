package Practice_Exercises.chapterOne;


/**
 * Task 9
 *
 */
public class SavingsAccountTester {

    /**
     * Tests the results for exercise Task 9
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(1000, 10);
        account.addInterest();
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 1100.0");

    }

}
