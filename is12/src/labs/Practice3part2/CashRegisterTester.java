package labs.Practice3part2;

import java.util.Scanner;

public class CashRegisterTester {
    public static void main(String[] args) {
        Task3_CashRegister register = new Task3_CashRegister();

        Scanner in = new Scanner(System.in);

        System.out.print("Пожалуйста, введите ваш платеж: ");
        register.recordPurchase(in.nextDouble());
        register.receivePayment();
        System.out.printf("Ваша сдача составляет $%.2f.\n", register.giveChange());

        in.close();
    }
}
