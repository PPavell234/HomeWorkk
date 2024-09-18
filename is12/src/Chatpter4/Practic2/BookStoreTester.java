package Chatpter4.Practic2;

import java.util.Scanner;

public class BookStoreTester {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Пожалуйста, введите общую стоимость книг: ");
        double price = in.nextDouble();
        System.out.print("Пожалуйста, введите количество книг: ");
        int number = in.nextInt();


        BookStore newOrder = new BookStore(price, number);
        newOrder.printOrder();

    }

}
