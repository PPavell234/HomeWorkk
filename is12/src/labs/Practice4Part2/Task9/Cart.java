package labs.Practice4Part2.Task9;

public class Cart {

    private String password;

    public Cart(String password) {

        if (password.length() == 4) {
            this.password = password;
            System.out.println("Пароль сохранен");
        } else {
            System.out.println("Ошибка пароль должено быть 4 символа");
        }
    }

    public String getPassword() {
        return password;
    }
}