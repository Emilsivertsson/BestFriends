import java.util.ArrayList;
import java.util.Scanner;

public class Friends {


    ArrayList<String> friends = new ArrayList<String>();


    public void addFriend(String name) {
        name = name.toLowerCase();
        if (friends.contains(name)) {
            System.out.println("That friend is already in the list");
        } else {
            friends.add(name);
        }


    }

    public void removeFriend(String name) {
        name = name.toLowerCase();
        if (friends.contains(name)) {
            friends.remove(name);
        } else {
            System.out.println("That friend does not exist");
        }
    }

    public void showAllFriends() {
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
    }

    public void showBestFriends(String friendOne, String friendTwo) {
        friendOne = friendOne.toLowerCase();
        friendTwo = friendTwo.toLowerCase();
        if (friends.contains(friendOne) && friends.contains(friendTwo)) {
            System.out.println(friendOne + " and " + friendTwo + " are best friends");
        } else {
            System.out.println("One or both of those friends does not exist");
        }
    }
}
