package labs.Practice4Part2.Task8;

class SavingsAccount {
    private double amount;
    private double openAccountNumberSavingsAccount;

    public SavingsAccount(double amount) {
        this.amount = amount;
        if (amount >= 0) {
            this.openAccountNumberSavingsAccount = amount;
            System.out.println("Отрытие счетна на : " + openAccountNumberSavingsAccount);
        } else {
            System.out.println("Ошибка открытия номера");
        }
    }

    public double requestForBalances() {
        System.out.print("Первоночальная сумма открытия счета : ");
        return openAccountNumberSavingsAccount;
    }

    public double replenish(double amountAdd) {
        if (amountAdd >= 0) {
            System.out.print("Баланс поле добаления : ");
            return this.amount += amountAdd;  // Пополняем счет
        }
        return 0;
    }

    public double transfer(double amount, PaymentAccount savingsAccount) {  // Добавляем параметр SavingsAccount
        if (amount >= 0 && amount <= this.amount) {
            this.amount -= amount;  // Снимаем деньги со счета
            savingsAccount.replenish(amount);  // Пополняем сберегательный счет
            System.out.print("Перевод на сберегательный счет ... сумма :  ");
            return amount;
        }
        return 0;
    }

    public double takeOff(double amount) {
        if (amount >= 0 && amount <= this.amount) { // Проверяем достаточность средств
            System.out.print("Баланс после снятия : ");
            return this.amount -= amount; // Снимаем деньги со счета
        }
        System.out.print("Ввидите достаточную сумму для снятия ");
        return 0;
    }

    public double getAmount() {
        System.out.print("Сберегательный счет баланс : ");
        return amount;
    }
}
