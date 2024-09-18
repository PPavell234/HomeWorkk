package Chatpter4.Practic2;

public class CashRegister {

    private double purchase;
    private double payment;


    public CashRegister() {

        this.purchase = 0;
        this.payment = 0;
    }


    public void recordPurchase(double amount) {
        this.purchase = purchase + amount;
    }


    public double giveChange() {
        double change = payment - purchase;
        this.purchase = 0;
        this.payment = 0;
        return change;
    }

    public void receivePayment() {

        Coin receiveCoin = new Coin();

        this.payment = receiveCoin.totalAmount();


    }
}
