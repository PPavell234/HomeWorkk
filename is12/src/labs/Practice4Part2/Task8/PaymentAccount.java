package labs.Practice4Part2.Task8;

//Расчетный счет
public class PaymentAccount {
    private double amount;
    private double openAccountNumberPaymentAccount = amount;

    public PaymentAccount(double amount) {
        this.amount = amount;
        if (amount >= 0) {
            this.openAccountNumberPaymentAccount = amount;
            System.out.println("Отрытие счетна на : " + openAccountNumberPaymentAccount);
        } else {
            System.out.println("Ошибка открытия номера");
        }
    }

    public double requestForBalances() {
        System.out.print("Первоночальная сумма открытия счета : " + openAccountNumberPaymentAccount);
        return openAccountNumberPaymentAccount;
    }

    public double replenish(double amountAdd) {
        if (amountAdd >= 0) {
            return this.amount += amountAdd;  // Пополняем счет
        }
        return 0;
    }


    public double takeOff(double amount) {
        if (amount >= 0 && amount <= this.amount) { // Проверяем достаточность средств
            return this.amount -= amount; // Снимаем деньги со счета
        }
        System.out.print("Ввидите достаточную сумму для снятия ");
        return 0; // Возвращаем 0, если не удалось снять деньги
    }

    public double transfer(double amount, SavingsAccount savingsAccount) {  // Добавляем параметр SavingsAccount
        if (amount >= 0 && amount <= this.amount) {
            this.amount -= amount;  // Снимаем деньги со счета
            savingsAccount.replenish(amount);  // Пополняем сберегательный счет
            System.out.print("Перевод на сберегательный счет ... сумма :  ");
            return amount;
        }
        return 0;
    }

    public double getAmount() {
        System.out.print("Расчетный счет баланс : ");
        return amount;
    }
}
