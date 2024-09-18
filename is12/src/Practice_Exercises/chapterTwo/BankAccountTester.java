package Practice_Exercises.chapterTwo;

/**
 * Task 12
 */


public class BankAccountTester {
    public static void main(String[] args) {
        // Создаем экземпляр банковского счета "mayo" с начальным балансом 1000, комиссией 4 и 2 бесплатными транзакциями
        BankAccounnt accountNew = new BankAccounnt(1000, 4, 2);
        System.out.println("Начальный баланс: " + accountNew.getBalance());

        // Бесплатные транзакции
        accountNew.deposit(1000);
        System.out.println("Баланс после внесения 1000: " + accountNew.getBalance());

        accountNew.deposit(400);
        System.out.println("Баланс после внесения 400: " + accountNew.getBalance());

        // Транзакции с комиссией
        accountNew.withdraw(150);
        System.out.println("Баланс после снятия 150 + комиссия 4.0: " + accountNew.getBalance());

        accountNew.deposit(200);
        System.out.println("Баланс после внесения 200 + комиссия 4.0: " + accountNew.getBalance());

        accountNew.deposit(45);
        System.out.println("Баланс после внесения 45 + комиссия 4.0: " + accountNew.getBalance());

        // Вычет ежемесячной платы
        accountNew.deductMonthlyCharge();

        System.out.println("Баланс в конце месяца: " + accountNew.getBalance());
    }
}


