package labs.Practice3part2;

public class Task4_BookStore {
    private final double totalPrice;
    private double bookNumber;
    final public double SALE_TAX_RATE = 7.5;
    final public double SHIPPING_CHARGE_PER_BOOK = 2.0;

    public Task4_BookStore(double totalBookPrice, int bookNumber) {

        this.totalPrice = totalBookPrice;
        this.bookNumber = bookNumber;

    }

    public double getShippingFee() {

        return bookNumber * SHIPPING_CHARGE_PER_BOOK;
    }

    public double getSaleTax() {

        return totalPrice * SALE_TAX_RATE / 100.0;
    }

    public double getOrderPrice() {

        return totalPrice + this.getShippingFee() + this.getSaleTax();
    }

    public void printOrder() {

        System.out.printf("Цена книг:         %8.2f$\n", totalPrice);
        System.out.printf("TНалог с продаж:               %8.2f$\n", this.getSaleTax());
        System.out.printf("Плата за доставку:        %8.2f$\n", this.getShippingFee());
        System.out.printf("Общая стоимость заказа:  %8.2f$\n", this.getOrderPrice());
    }
}
