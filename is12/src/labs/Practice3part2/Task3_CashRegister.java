package labs.Practice3part2;

public class Task3_CashRegister {

    private double purchase;
    private double payment;

    /**
     * Constructs a cash register with no money in it.
     */

    public Task3_CashRegister() {

        this.purchase = 0;
        this.payment = 0;
    }

    /**
     * Records the purchase price of an item.
     *
     * @param amount
     *            the price of the purchased item
     */
    public void recordPurchase(double amount) {
        this.purchase = purchase + amount;
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     *
     * @return the change due to the customer
     */
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
