package Practice_Exercises;

public class BankAccount
{
    private double balance;
    private int transaction;
    final private double transactionFee = 5;
    final private int monthlyTransactionNumber = 6;
    //private int withdraw;

    /**
     Constructs a bank account with a zero balance.
     */
    public BankAccount()
    {
        balance = 0;
        transaction = 0;

    }

    /**
     Constructs a bank account with a given balance.
     @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    /**
     Deposits money into the bank account.
     @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
        transaction = transaction + 1;
    }

    /**
     Withdraws money from the bank account.
     @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
        transaction = transaction + 1;
    }

    /**
     Gets the current balance of the bank account.
     @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
    /**
     * deduct transaction fee at the end of each month, first 5 transactions are free, rest of them
     * is charged $1/time.
     *
     */

    public void deductTransactionFee() {

        int chargeNumber = Math.max((transaction - monthlyTransactionNumber), 0);
        balance = balance - chargeNumber * transactionFee;
        transaction = 0;

    }
}