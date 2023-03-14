public class Menu {

    public void menu() {
        System.out.println("1. Add a friend");
        System.out.println("2. Remove a friend");
        System.out.println("3. Show all friends");
        System.out.println("4. Show best friends");
        System.out.println("5. Exit");
    }

    public void addFriend() {
        System.out.println("What is the name of your friend?");
    }

    public void removeFriend() {
        System.out.println("Witch friend do you want to remove?");
    }

    public void allFriends() {
        System.out.println("Here´s a list of all your friends: ");
    }

    public void BestFriends() {
        System.out.println("Who are best friends?");
    }

    public void bestfriendone() {
        System.out.println("friend one: ?");
    }

    public void bestfriendtwo() {
        System.out.println("friend two: ?");
    }

    public void exit() {
        System.out.println("Thanx for playing with your friends!");
        System.exit(0);
    }
}
