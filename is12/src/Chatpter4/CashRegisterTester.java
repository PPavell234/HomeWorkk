package Chatpter4;

public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();

        register.recordPurchase(20.37);
        register.enterDollars(20);
        register.enterQuarters(2);
        System.out.printf("Получаем:  %5.2f\n", register.giveChange());
        System.out.println("Ожидаемый резултат: 0,13");

    }
}
