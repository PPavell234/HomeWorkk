package labs.la2;

public class Person {

    private String name; // Имя человека.
    private String friend; // Строка, содержащая имена друзей, разделенные пробелами.
    private int friendNumber; // Количество друзей.

    /**
     * Создает новый объект Person с заданным именем.
     *
     * @param name Имя человека.
     */
    public Person(String name) {
        this.name = name;
        this.friend = " "; // Пустая строка, представляющая отсутствие друзей.
        this.friendNumber = 0;
    }

    /**
     * Устанавливает дружеские отношения между данным человеком и другим человеком.
     * Добавляет имя другого человека в список друзей текущего человека.
     *
     * @param p Другой человек, с которым устанавливаются дружеские отношения.
     */
    public void beFriend(Person p) {
        friend = friend + " " + p.name;
        friendNumber++;
        System.out.println(name + " и " + p.name + " теперь друзья.");
    }

    /**
     * Прекращает дружеские отношения между данным человеком и другим человеком.
     * Удаляет имя другого человека из списка друзей текущего человека.
     *
     * @param p Другой человек, с которым прекращаются дружеские отношения.
     */
    public void unFriend(Person p) {
        String name = p.name;
        friend = friend.replace(" " + name, "");
        friendNumber--;
    }

    /**
     * Возвращает строку, содержащую имена всех друзей текущего человека.
     *
     * @return Строка с именами друзей текущего человека.
     */
    public String getFriendNames() {
        return "У этого человека " + name + " есть следующие друзья: " + friend.trim();
    }

    /**
     * Возвращает количество друзей текущего человека.
     *
     * @return Количество друзей текущего человека.
     */
    public int getFriendCount(){
        return friendNumber;
    }
}