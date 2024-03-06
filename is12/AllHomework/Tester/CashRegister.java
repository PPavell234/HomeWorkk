package Tester;

public class CashRegister {
    private double tax;
    public double change;

    public double cost;

    public double price;




    public CashRegister(double tax,double cost,double price) {
        this.tax = tax;
        this.cost = cost;
        this.price=price;
    }

    public void recordTaxablePurchase(){
        tax = cost * tax;


    }
    public void getTotalTax(){
        System.out.println("С налогом " + tax+"Настоящая стоимость товара"+cost);
    }

    public void recordPurchase(){
        System.out.println("Был куплен товар на сумму"+cost);

    }

    public void giveChange(){
        change = cost - price;
        System.out.println("Сдача состовляет около" + change);
    }
}
