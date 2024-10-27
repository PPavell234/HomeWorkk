package labs.Practice4Part2.Task8;

//Расчетный счет
public class PaymentAccount {
    private double amount; // Текущая сумма на расчетном счете
    private double openAccountNumberPaymentAccount = amount; // Сумма при открытии счета

    /**
     * Конструктор для создания расчетного счета с заданной суммой.
     *
     * @param amount Начальная сумма для открытия счета. Должна быть неотрицательной.
     */
    public PaymentAccount(double amount) {
        this.amount = amount;
        if (amount >= 0) {
            this.openAccountNumberPaymentAccount = amount;
            System.out.println("Открытие счета на: " + openAccountNumberPaymentAccount);
        } else {
            System.out.println("Ошибка открытия номера");
        }
    }

    /**
     * Запрашивает текущий баланс расчетного счета.
     *
     * @return Текущая сумма на расчетном счете.
     */
    public double requestForBalances() {
        System.out.print("Первоначальная сумма открытия счета: " + openAccountNumberPaymentAccount);
        return openAccountNumberPaymentAccount;
    }

    /**
     * Пополняет расчетный счет на заданную сумму.
     *
     * @param amountAdd Сумма для пополнения счета. Должна быть неотрицательной.
     * @return Новая сумма на расчетном счете после пополнения.
     */
    public double replenish(double amountAdd) {
        if (amountAdd >= 0) {
            return this.amount += amountAdd;  // Пополняем счет
        }
        return 0; // Возвращаем 0, если сумма пополнения отрицательная
    }

    /**
     * Снимает указанную сумму с расчетного счета.
     *
     * @param amount Сумма для снятия. Должна быть неотрицательной и не превышать текущий баланс.
     * @return Новая сумма на расчетном счете после снятия.
     */
    public double takeOff(double amount) {
        if (amount >= 0 && amount <= this.amount) { // Проверяем достаточность средств
            return this.amount -= amount; // Снимаем деньги со счета
        }
        System.out.print("Введите достаточную сумму для снятия ");
        return 0; // Возвращаем 0, если не удалось снять деньги
    }

    /**
     * Переводит указанную сумму с расчетного счета на сберегательный счет.
     *
     * @param amount         Сумма для перевода. Должна быть неотрицательной и не превышать текущий баланс.
     * @param savingsAccount Сберегательный счет, на который будет переведена сумма.
     * @return Сумма, переведенная на сберегательный счет.
     */
    public double transfer(double amount, SavingsAccount savingsAccount) {  // Добавляем параметр SavingsAccount
        if (amount >= 0 && amount <= this.amount) {
            this.amount -= amount;  // Снимаем деньги со счета
            savingsAccount.replenish(amount);  // Пополняем сберегательный счет
            System.out.print("Перевод на сберегательный счет ... сумма: ");
            return amount;
        }
        return 0; // Возвращаем 0, если не удалось перевести деньги
    }

    /**
     * Получает текущую сумму на расчетном счете.
     *
     * @return Текущая сумма на расчетном счете.
     */
    public double getAmount() {
        System.out.print("Расчетный счет баланс: ");
        return amount;
    }
}