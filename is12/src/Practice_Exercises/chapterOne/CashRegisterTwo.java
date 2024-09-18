package Practice_Exercises.chapterOne;

public class CashRegisterTwo {

    private double purchase; // Общая сумма покупок
    private final StringBuilder receipt = new StringBuilder(); // Текст чека
    private int salesCount; // Переменная отслеживает количество продаж
    private double salesTotal; // Общая сумма продаж за день
    private double lastPrice; // Последняя зарегистрированная цена

    /**
     * Создает новый экземпляр CashRegisterTwo с нулевыми начальными значениями.
     */
    public CashRegisterTwo() {
        purchase = 0;
        salesCount = 0;
        salesTotal = 0;
        lastPrice = 0;
    }

    /**
     * Записывает стоимость покупки и обновляет информацию о чеке.
     * @param price стоимость покупки
     */
    public void recordPurchase(double price) {
        purchase += price;
        lastPrice = price;
        addPriceToReceipt(price);
    }

    /**
     * Выводит чек на печать в консоль.
     */
    public void printReceipt() {
        System.out.println(receipt);
        System.out.println("===================");
        System.out.printf("Total:   %.2f\n", purchase);
    }

    private void addPriceToReceipt(double price) {
        receipt.append(String.valueOf(price)).append(" \n         ");
        salesCount++;
    }

    /**
     * Получает общую сумму продаж за день.
     * @return общая сумма продаж за день
     */
    public double getSalesTotal() {
        return salesTotal;
    }

    /**
     * Получает количество продаж.
     * @return количество продаж
     */
    public int getSalesCount() {
        return salesCount;
    }

    /**
     * Сбрасывает все данные кассового аппарата до начальных значений.
     */
    public void reset() {
        purchase = 0;
        salesCount = 0;
        salesTotal = 0;
        receipt.setLength(0); // Очистка текста чека
        lastPrice = 0; // Очистка последней цены
    }
}
