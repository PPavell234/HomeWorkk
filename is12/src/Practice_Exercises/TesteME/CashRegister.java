package Practice_Exercises.TesteME;

public class CashRegister {
    private double purchase; // Эта переменная хранит общую сумму покупок
    private double payment; //сумму платежей за текущую транзакцию.
    private StringBuilder priceString = new StringBuilder(); //построения строки, которая будет представлять список цен товаров на квитанции.
    private int salesCount; //переменная отслеживает количество продаж
    private double salesTotal; //общую сумму продаж за день.
    private double salesTax; //ставку налога на продажу в процентах.
    private double totalSalesTax = 0; // Эта переменная хранит общую сумму налога на продажу за текущую транзакцию.

    public CashRegister() {
        purchase = 0;
        payment = 0;
        salesCount = 0;
        salesTotal = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        appendPrice(amount);
    }

    public void recordTaxablePurchase(double amount) {
        double totalAmount = amount * (1 + salesTax / 100.0);
        purchase += totalAmount;
        appendPrice(amount);
        totalSalesTax += amount * salesTax;
    }

    public void recievePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        System.out.println("Sales Tax: " + totalSalesTax);
        salesTotal += purchase;
        double change = payment - purchase;
        reset();
        return change;
    }

    public void printReceipt() {
        System.out.println("Receipt:");
        System.out.println("         " + priceString);
        System.out.println("=================");
        System.out.println("Total:   " + purchase);
    }

    public double getSalesTotal() {
        return salesTotal;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public double getPayment() {
        return payment;
    }

    private void appendPrice(double amount) {
        priceString.append(String.format("%.2f", amount)).append(" \n         ");
        salesCount++;
    }

    private void reset() {
        purchase = 0;
        payment = 0;
        totalSalesTax = 0;
    }
}