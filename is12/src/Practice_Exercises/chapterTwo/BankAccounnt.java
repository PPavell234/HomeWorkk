package Practice_Exercises.chapterTwo;

/**
 * Task 12
 */

public class BankAccounnt {
    private double balance; // The current balance of the account.
    private double transactionFee; // The fee charged for each transaction.
    private int transactionCount; // The number of transactions made.
    private int freeTransactions; // The number of free transactions allowed.

    /**
     * Constructs an object BankAccount with an initial balance 0
     * and a fee to be levied every transaction.
     *
     * @param fee amount to be charged per transaction
     */
    public BankAccounnt(double fee, int freeTransactions) {
        this.freeTransactions = freeTransactions;
        transactionCount = 0;
        transactionFee = fee;
        balance = 0;
    }

    /**
     * Constructs an object BankAccount with a given initial balance
     * and a fee to be levied every transaction.
     *
     * @param initialBalance initial balance
     * @param fee            amount to be charged per transaction
     */
    public BankAccounnt(double initialBalance, double fee, int freeTransactions) {
        this.freeTransactions = freeTransactions;
        transactionCount = 0;
        transactionFee = fee;
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance = balance + amount;
        transactionCount++;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
        transactionCount++;
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deducts a monthly charge from the bank account at the end of the month.
     */
    public void deductMonthlyCharge() {
        double transactions = Math.max(transactionCount, freeTransactions) - freeTransactions;
        balance = balance - (transactions * transactionFee);
        transactionCount = 0;
    }
}