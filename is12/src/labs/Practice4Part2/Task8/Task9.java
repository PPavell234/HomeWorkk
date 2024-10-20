package labs.Practice4Part2.Task8;

public class Task9 {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount(50);
        PaymentAccount account2 = new PaymentAccount(50);
        System.out.println(account1.requestForBalances());
        System.out.println(account1.replenish(100));
        System.out.println(account1.requestForBalances());
        System.out.println(account1.takeOff(13));
        System.out.println(account1.getAmount());
        System.out.println(account1.transfer(100, account2));
        System.out.println(account1.getAmount());


    }
}
