package Practice_Exercises.chapterTwo;

/*
 *Task 9
 */


public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount harrysChecking = new BankAccount();
        harrysChecking.deposit(2000);
        harrysChecking.withdraw(500);
        System.out.println(harrysChecking.getBalance());
        System.out.println("Expected: 1500");

        harrysChecking.withdraw(500);
        harrysChecking.withdraw(500);
        harrysChecking.deposit(1000);
        harrysChecking.deposit(5000);
        harrysChecking.withdraw(1000);
        harrysChecking.withdraw(500);
        harrysChecking.deductTransactionFee();
        System.out.println(harrysChecking.getBalance());

    }
}
