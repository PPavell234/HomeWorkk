package Chatpter4.Practic2;

public class BookStore {

    private double totalPrice;
    private double bookNumber;
    final public double SALE_TAX_RATE = 7.5;
    final public double SHIPPING_CHARGE_PER_BOOK = 2.0;

    public BookStore(double totalBookPrice, int bookNumber) {

        this.totalPrice = totalBookPrice;
        this.bookNumber = bookNumber;

    }

    public double getShippingFee() {

        double shippingFee = bookNumber * SHIPPING_CHARGE_PER_BOOK;

        return shippingFee;
    }

    public double getSaleTax() {

        double saleTax = totalPrice * SALE_TAX_RATE / 100.0;

        return saleTax;
    }

    public double getOrderPrice() {

        double orderPrice = totalPrice + this.getShippingFee() + this.getSaleTax();
        return orderPrice;
    }

    public void printOrder() {

        System.out.printf("Цена книг:                   %8.2f$\n", totalPrice);
        System.out.printf("Сумма налога на продажу:      %8.2f$\n", this.getSaleTax());
        System.out.printf("Плата за доставку:            %8.2f$\n", this.getShippingFee());
        System.out.printf("Общая стоимость заказа:       %8.2f$\n", this.getOrderPrice());
    }
}
