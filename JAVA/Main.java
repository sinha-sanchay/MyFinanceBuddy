import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var userService = new UserService();

        System.out.println("Welcome to the Personal Finance Management System!");
        while (true) {
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            System.out.print("Enter your choice: ");
            var choice = sc.nextInt();

            switch (choice) {
                case 1 -> userService.registerUser();
                case 2 -> userService.loginUser();
                case 3 -> {
                    System.out.println("Thank you for using the system. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option!! Please try again.");
            }
        }
    }
}
