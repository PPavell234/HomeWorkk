package Tester;

public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister(5,100,99);
        cashRegister.giveChange();

        cashRegister.giveChange();
        cashRegister.recordTaxablePurchase();
        cashRegister.getTotalTax();

    }
}
