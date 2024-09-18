/*
package Practice_Exercises.chapterOne;

public class CashRegisterTwo2 {

    private double purchase; // Общая сумма покупок
    private final StringBuilder receipt = new StringBuilder(); // Текст чека
    private double salesTotal; // Общая сумма продаж за день

    private int salesCount; //переменная отслеживает количество продаж

    private double payment;



    public CashRegisterTwo2()
    {
        purchase = 0;
        salesCount = 0;
        salesTotal = 0;

    }
    public void recordPurchase(double amount) {
        purchase += amount;
        addPriceToReceipt(amount);
    }

    public void recievePayment(double amount) {
        salesTotal += purchase; // Assuming payment is received after recording purchase
        double change = amount - purchase;
        reset();
        System.out.println("Change: " + change);
        printReceipt();
    }

    public void giveChange()
    {
        salesTotal = salesTotal + purchase;
        double change = payment - purchase;
        System.out.println("Payment: " + payment);
        purchase = 0;
        payment = 0;
    }

    public void printReceipt() {
        System.out.println(receipt);
        System.out.println("===================");
        System.out.printf("Total:   %.2f\n", purchase);
    }

    public double getSalesTotal() {
        return salesTotal;
    }

    private void addPriceToReceipt(double amount) {
        receipt.append(String.valueOf(amount)).append(" \n         ");
        salesCount++;
    }

    public int getSalesCount() {
        return salesCount;
    }

    private void reset() {
        purchase = 0;
        salesCount = 0;
        salesTotal = 0;
    }
}*/
