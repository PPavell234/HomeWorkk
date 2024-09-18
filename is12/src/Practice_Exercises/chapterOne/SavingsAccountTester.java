package Practice_Exercises.chapterOne;


/**
 * Task 9
 */
public class SavingsAccountTester {


    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(1000, 10);
        account.addInterest();
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 1100.0");

    }

}
