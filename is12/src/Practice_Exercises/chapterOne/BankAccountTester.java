package Practice_Exercises.chapterOne;

public class BankAccountTester {
    //Task 7


    public static void main(String[] args) {
        //Task 7
        BankAccount harrysChecking = new BankAccount();
        harrysChecking.deposit(1000);
        harrysChecking.withdraw(500);
        harrysChecking.withdraw(400);
        System.out.println(harrysChecking.getBalance());
        System.out.println("Expected: 100");


        //Task 8
        BankAccount momsSavings = new BankAccount(1000);
        momsSavings.addInterest(10);// процентаная ставка 10 процентов

        System.out.println(momsSavings.getBalance());
        // 1) 10 / 100 = 0,1 2) (0,1*1000)+1000=1100,0
        System.out.println("Expected: 1100,0");

    }
}