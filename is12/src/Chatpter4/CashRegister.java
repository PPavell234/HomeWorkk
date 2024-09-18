package Chatpter4;

public class CashRegister {
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    private double purchase;
    private double payment;

    /**
     * Создает кассовый аппарат без наличия денег в нем.
     */
    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    /**
     * Записывает стоимость покупки товара.
     *
     * @param amount цена приобретенного товара
     */
    public void recordPurchase(double amount) {
        purchase = purchase + amount;
    }

    /**
     * Обрабатывает полученную оплату от покупателя.
     *
     * @param dollars  количество долларов в оплате
     * @param quarters количество четвертаков в оплате
     * @param dimes    количество десятых в оплате
     * @param nickels  количество никелей в оплате
     * @param pennies  количество пенни в оплате
     */
    public void receivePayment(int dollars, int quarters,
                               int dimes, int nickels, int pennies) {
        payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
                + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }

    /**
     * Вычисляет сдачу и сбрасывает кассовый аппарат для следующего покупателя.
     *
     * @return сдачу покупателю
     */
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    /**
     * Вводит количество долларов в оплате
     *
     * @param dollars доллары
     */
    public void enterDollars(int dollars) {
        payment = payment + dollars;
    }

    /**
     * Вводит количество четвертаков в оплате
     *
     * @param quarters четвертаки
     */
    public void enterQuarters(int quarters) {
        payment = payment + (quarters * QUARTER_VALUE);
    }

    /**
     * Вводит количество десятых в оплате
     *
     * @param dimes десятные
     */
    public void enterDimes(int dimes) {
        payment = payment + (dimes * DIME_VALUE);
    }

    /**
     * Вводит количество никелей в оплате
     *
     * @param nickels никели
     */
    public void enterNickels(int nickels) {
        payment = payment + (nickels * NICKEL_VALUE);
    }

    /**
     * Вводит количество пенни в оплате
     *
     * @param pennies пенни
     */
    public void enterPennies(int pennies) {
        payment = payment + (pennies * PENNY_VALUE);
    }
}