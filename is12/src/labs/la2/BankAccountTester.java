package labs.la2;

import Practice_Exercises.chapterTwo.BankAccounnt;

public class BankAccountTester {
    public static void main(String[] args) {
        // Создаем банковский счет с начальным балансом 100 и комиссией 1 за транзакцию, с 3 бесплатными транзакциями
        BankAccounnt account = new BankAccounnt (100, 1, 3);

        // Вносим деньги на счет
        account.deposit(50);
        System.out.println("Текущий баланс после внесения: " + account.getBalance());

        // Снимаем деньги со счета
        account.withdraw(30);
        System.out.println("Текущий баланс после снятия: " + account.getBalance());

        // Проверяем баланс
        System.out.println("Текущий баланс: " + account.getBalance());

        // Вычитаем ежемесячную плату
        account.deductMonthlyCharge();
        System.out.println("Баланс после вычета ежемесячной платы: " + account.getBalance());
    }
}