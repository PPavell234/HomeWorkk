package labs.Practice4Part2.Task8;

//Сберегательный счет
public class SavingsAccount {
    private double amount; // Текущая сумма на сберегательном счете
    private double openAccountNumberSavingsAccount; // Сумма при открытии счета

    /**
     * Конструктор для создания сберегательного счета с заданной суммой.
     *
     * @param amount Начальная сумма для открытия счета. Должна быть неотрицательной.
     */
    public SavingsAccount(double amount) {
        this.amount = amount;
        if (amount >= 0) {
            this.openAccountNumberSavingsAccount = amount;
            System.out.println("Открытие счета на: " + openAccountNumberSavingsAccount);
        } else {
            System.out.println("Ошибка открытия номера");
        }
    }

    /**
     * Запрашивает текущий баланс сберегательного счета.
     *
     * @return Текущая сумма на сберегательном счете.
     */
    public double requestForBalances() {
        System.out.print("Первоначальная сумма открытия счета: ");
        return openAccountNumberSavingsAccount;
    }

    /**
     * Пополняет сберегательный счет на заданную сумму.
     *
     * @param amountAdd Сумма для пополнения счета. Должна быть неотрицательной.
     * @return Новая сумма на сберегательном счете после пополнения.
     */
    public double replenish(double amountAdd) {
        if (amountAdd >= 0) {
            System.out.print("Баланс после добавления: ");
            return this.amount += amountAdd;  // Пополняем счет
        }
        return 0; // Возвращаем 0, если сумма пополнения отрицательная
    }

    /**
     * Переводит указанную сумму со сберегательного счета на расчетный счет.
     *
     * @param amount         Сумма для перевода. Должна быть неотрицательной и не превышать текущий баланс.
     * @param paymentAccount Расчетный счет, на который будет переведена сумма.
     * @return Сумма, переведенная на расчетный счет.
     */
    public double transfer(double amount, PaymentAccount paymentAccount) {  // Изменяем параметр на PaymentAccount
        if (amount >= 0 && amount <= this.amount) {
            this.amount -= amount;  // Снимаем деньги со счета
            paymentAccount.replenish(amount);  // Пополняем расчетный счет
            System.out.print("Перевод на расчетный счет ... сумма: ");
            return amount;
        }
        return 0; // Возвращаем 0, если не удалось перевести деньги
    }

    /**
     * Снимает указанную сумму со сберегательного счета.
     *
     * @param amount Сумма для снятия. Должна быть неотрицательной и не превышать текущий баланс.
     * @return Новая сумма на сберегательном счете после снятия.
     */
    public double takeOff(double amount) {
        if (amount >= 0 && amount <= this.amount) { // Проверяем достаточность средств
            System.out.print("Баланс после снятия: ");
            return this.amount -= amount; // Снимаем деньги со счета
        }
        System.out.print("Введите достаточную сумму для снятия ");
        return 0; // Возвращаем 0, если не удалось снять деньги
    }

    /**
     * Получает текущую сумму на сберегательном счете.
     *
     * @return Текущая сумма на сберегательном счете.
     */
    public double getAmount() {
        System.out.print("Сберегательный счет баланс: ");
        return amount;
    }
}
