package Practice_Exercises.TesteME;

public class CashRegisterTwo {
    private double purchase; // Общая сумма покупок
    private final StringBuilder receipt = new StringBuilder(); // Текст чека
    private int salesCount; // Переменная отслеживает количество продаж
    private double salesTotal; // Общая сумма продаж за день
    private double lastPrice; // Последняя зарегистрированная цена

    /**
     * Конструктор по умолчанию. Устанавливает начальные значения общей суммы покупок,
     * количества продаж, общей суммы продаж и последней цены.
     */
    public CashRegisterTwo() {
        purchase = 0;
        salesCount = 0;
        salesTotal = 0;
        lastPrice = 0;
    }

    /**
     * Записывает цену покупки и обновляет общую сумму покупок.
     *
     * @param price цена покупки
     */
    public void recordPurchase(double price) {
        purchase += price;
        lastPrice = price;
        addPriceToReceipt(price);
    }

    /**
     * Выводит чек покупки на экран.
     */
    public void printReceipt() {
        System.out.println(receipt);
        System.out.println("===================");
        System.out.printf("Итого:   %.2f\n", purchase);

        // Отображение последней цены
        System.out.println("Цена: " + lastPrice);
    }

    private void addPriceToReceipt(double price) {
        receipt.append(String.valueOf(price)).append(" \n         ");
        salesCount++;
    }

    /**
     * Получает общую сумму продаж за день.
     *
     * @return общая сумма продаж за день
     */
    public double getSalesTotal() {
        return salesTotal;
    }

    /**
     * Получает количество продаж.
     *
     * @return количество продаж
     */
    public int getSalesCount() {
        return salesCount;
    }

    /**
     * Сбрасывает значения переменных, связанных с текущей покупкой и общими продажами.
     */
    public void reset() {
        purchase = 0;
        salesCount = 0;
        salesTotal = 0;
        receipt.setLength(0); // Очистка текста чека
        lastPrice = 0; // Очистка последней цены
    }
}