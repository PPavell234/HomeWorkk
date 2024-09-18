package Practice_Exercises.chapterTwo;

/**
 * Task 12
 */

public class BankAccounnt {
    private double balance; // Текущий баланс счета.
    private double transactionFee; // Плата, взимаемая за каждую транзакцию.
    private int transactionCount; // Количество совершенных транзакций.
    private int freeTransactions; // Количество бесплатных транзакций, разрешенных.

    /**
     * Создает объект BankAccount с начальным балансом 0
     * и сбором, взимаемым за каждую транзакцию.
     *
     * @param freeTr сумма, взимаемая за каждую транзакцию
     */
    public BankAccounnt(double freeTr, int freeTransactions) {
        this.freeTransactions = freeTransactions;
        transactionCount = 0;
        transactionFee = freeTr;
        balance = 0;
    }

    /**
     * Создает объект BankAccount с заданным начальным балансом
     * и сбором, взимаемым за каждую транзакцию.
     *
     * @param initialBalance - начальный баланс
     * @param freeTr - сумма, взимаемая за каждую транзакцию
     */
    public BankAccounnt(double initialBalance, double freeTr, int freeTransactions) {
        this.freeTransactions = freeTransactions;
        transactionCount = 0;
        transactionFee = freeTr;
        balance = initialBalance;
    }

    /**
     * Вносит деньги на банковский счет
     *
     * @param amount сумма для внесения
     */
    public void deposit(double amount) {
        balance = balance + amount;
        transactionCount++;
    }

    /**
     * Снимает деньги с банковского счета.
     *
     * @param amount сумма для снятия
     */
    public void withdraw(double amount) {
        balance = balance - amount;
        transactionCount++;
    }



    /**
     * Вычитает ежемесячный сбор с банковского счета в конце месяца.
     */
    public void deductMonthlyCharge() {
        int additionalTransactions = transactionCount - freeTransactions;
        double charge = additionalTransactions * transactionFee;
        balance -= charge;
        transactionCount = 0;
    }

    /**
     * Получает текущий баланс банковского счета.
     *
     * @return текущий баланс
     */
    public double getBalance() {
        return balance;
    }
}