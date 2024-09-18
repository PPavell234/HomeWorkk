package Practice_Exercises.chapterOne;

public class CashRegisterTesterTwo {

    public static void main(String[] args) {
        CashRegisterTwo register = new CashRegisterTwo();

        register.recordPurchase(10.50);
        register.recordPurchase(778.25);

        register.printReceipt();


        register.reset();

        register.recordPurchase(100.50);
        register.recordPurchase(7.25);

        register.printReceipt();


        register.reset();
    }


}

