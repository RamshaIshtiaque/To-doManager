package todolistmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create User");
            System.out.println("2. Add Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();
                    users.add(new User(name));
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    name = scanner.nextLine();
                    User user = findUser(name);
                    if (user != null) {
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        user.addTask(description);
                    } else {
                        System.out.println("User not found");
                    }
                    break;
                case 3:
                    System.out.print("Enter user name: ");
                    name = scanner.nextLine();
                    user = findUser(name);
                    if (user != null) {
                        System.out.print("Enter task description to mark as completed: ");
                        String description = scanner.nextLine();
                        user.markTaskAsCompleted(description);
                    } else {
                        System.out.println("User not found");
                    }
                    break;
                case 4:
                    for (User u : users) {
                        u.printTasks();
                    }
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static User findUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}

