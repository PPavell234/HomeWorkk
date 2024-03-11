package Practice_Exercises.chapterTwo;

/**
 * Task 6
 */

public class Person {

    private String name; // The name of the person.
    private String friend; // A string representing the names of friends.
    private int friendNumber;  // The number of friends


    /**
     * Constructs a new Person object with the specified name.
     *
     * @param name The name of the person.
     */
    public Person(String name) {

        this.name = name;
        this.friend = " ";
        this.friendNumber = 0;

    }

    /**
     * Adds the specified person as a friend to this person.
     *
     * @param p The person to be added as a friend.
     */

    public void beFriend(Person p) {

        friend = friend + " " + p.name;
        friendNumber = friendNumber + 1;

    }


    /**
     * Removes the specified person from the list of friends.
     *
     * @param p The person to be removed as a friend.
     */
    public void unFriend(Person p) {

        String name = p.name;
        friend = friend.replace(" " + name, "");
        friendNumber = friendNumber - 1;

    }


    /**
     *Task 7
     */

    /**
     * Gets the names of all friends of this person.
     *
     * @return A string containing the names of all friends.
     */

    public String getFriendNames() {

        return friend.trim();
    }

    /**
     * Gets the number of friends of this person.
     *
     * @return The number of friends.
     */

    public int getFriendNumber() {

        return friendNumber;
    }
}