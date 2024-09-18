package labs.la2;

public class PersonTester {
    public static void main(String[] args) {
        Person Nikita = new Person("Никита");
        Person Sasha = new Person("Саша");
        Person Masha = new Person("Маша");
        Person Andrey = new Person("Андрей");
        Person Sergey = new Person("Сергей");


        Nikita.beFriend(Sasha);
        System.out.println(Nikita.getFriendCount());
        Nikita.beFriend(Masha);
        Nikita.beFriend(Andrey);
        System.out.println(Nikita.getFriendNames());
        System.out.println(Nikita.getFriendCount());
        Nikita.unFriend(Masha);
        Nikita.beFriend(Sergey);
        System.out.println(Nikita.getFriendNames());
        System.out.println(Nikita.getFriendCount());
    }
}
