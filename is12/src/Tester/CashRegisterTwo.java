package Tester;

public class CashRegisterTwo {


    private double purchase; // Общая сумма покупок
    private final StringBuilder receipt = new StringBuilder(); // Текст чека
    private int salesCount; // Переменная отслеживает количество продаж
    private double salesTotal; // Общая сумма продаж за день
    private double lastPrice; // Последняя зарегистрированная цена

    public CashRegisterTwo() {
        purchase = 0;
        salesCount = 0;
        salesTotal = 0;
        lastPrice = 0;
    }

    public void recordPurchase(double price) {
        purchase += price;
        lastPrice = price;
        addPriceToReceipt(price);
    }

    public void printReceipt() {
        System.out.println(receipt);
        System.out.println("===================");
        System.out.printf("Total:   %.2f\n", purchase);


    }

    private void addPriceToReceipt(double price) {
        receipt.append(String.valueOf(price)).append(" \n         ");
        salesCount++;
    }

    public double getSalesTotal() {
        return salesTotal;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void reset() {
        purchase = 0;
        salesCount = 0;
        salesTotal = 0;
        receipt.setLength(0); // Очистка текста чека
        lastPrice = 0; // Очистка последней цены
    }

}