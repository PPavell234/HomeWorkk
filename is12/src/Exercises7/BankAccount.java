package Exercises7;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void replenishBalance(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма не может быть отрицательной.");
        }

        balance += amount;
    }

    public void takeOffBalance(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма не может быть отрицательной.");
        }

        if (balance < amount) {
            throw new RuntimeException("Недостаточно средств на счете.");
        }

        balance -= amount;
    }

    class NewAccount {
        public static void main(String[] args) {
            BankAccount account = new BankAccount(100);

            // Пополнить счет на 2000 рублей
            account.replenishBalance(2000);

            // Проверить баланс
            System.out.println(account.getBalance()); // 2100

            // Снять со счета 300 рублей
            account.takeOffBalance(300);

            // Проверить баланс
            System.out.println(account.getBalance()); // 1800


        }


    }
}


