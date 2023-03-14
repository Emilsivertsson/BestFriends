import java.util.InputMismatchException;
import java.util.Scanner;

public class Logic {
    Scanner scanner = new Scanner(System.in);
    Friends friends = new Friends();

    Menu menu = new Menu();

    int choice;
    String name;
    String friendone;
    String friendtwo;

    public void start() {
        friends.addFriend("lisa");
        friends.addFriend("erik");
        friends.addFriend("anna");
        friends.addFriend("kajsa");
        friends.addFriend("kalle");

        while (true) {
            menu.menu();

            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1:
                        menu.addFriend();
                        scanner.nextLine();
                        name = scanner.nextLine();
                        friends.addFriend(name);
                        break;
                    case 2:
                        friends.showAllFriends();
                        menu.removeFriend();
                        scanner.nextLine();
                        name = scanner.nextLine();
                        friends.removeFriend(name);
                        break;
                    case 3:
                        menu.allFriends();
                        friends.showAllFriends();
                        break;
                    case 4:
                        friends.showAllFriends();
                        menu.BestFriends();
                        menu.bestfriendone();
                        scanner.nextLine();
                        friendone = scanner.nextLine();
                        menu.bestfriendtwo();
                        friendtwo = scanner.nextLine();
                        friends.showBestFriends(friendone, friendtwo);
                        break;
                    case 5:
                        menu.exit();
                        break;
                    default:
                        System.out.println("Only 1-5 please");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Only 1-5 please");
            }


        }

    }
}
