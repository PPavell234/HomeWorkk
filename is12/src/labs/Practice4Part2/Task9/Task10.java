package labs.Practice4Part2.Task9;

import java.util.Scanner;



public class Task10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Cart cart = new Cart("1244");
            Cart cart2 = new Cart("1243");
            Bank TBank = new Bank(cart2);

            while (!TBank.isBlocked) { // Цикл, пока карта не заблокирована
                System.out.print("Введите пароль карты: ");
                String password = sc.nextLine();
                TBank.lastEnteredPassword = password; // Сохраняем введенный пароль

                if (TBank.checkCredentials(password)) {
                    System.out.println("Пароль верный");
                    TBank.savePasswordToFile("password.txt");
                    break; // Выходим из цикла, если пароль верный
                } else {
                    System.out.println("Неверно, осталось попыток: " + (Bank.MAX_ATTEMPTS - TBank.failedAttempts));
                }
            }

            if (TBank.isBlocked) {
                System.out.println("Ваша карта заблокирована.");
            }

        sc.close();
    }
}