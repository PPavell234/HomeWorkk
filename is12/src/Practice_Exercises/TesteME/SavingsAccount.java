package Practice_Exercises.TesteME;

public class SavingsAccount {
    private double balance;
    private final double interest;

    public SavingsAccount(double initialBalance, double interestRate) {
        balance = initialBalance;
        interest = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest() {
        balance *= (1 + interest / 100);
    }
}