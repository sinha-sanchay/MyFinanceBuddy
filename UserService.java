import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UserService {
    private Map<String, User> users = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.next().trim();
        System.out.print("Enter password: ");
        String password = scanner.next().trim();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Error: Username and password cannot be empty.");
            return;
        }

        if (users.containsKey(username)) {
            System.out.println("Username already exists!");
        } else {
            users.put(username, new User(username, password));
            System.out.println("User registered successfully!");
        }
    }

    public void loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.next().trim();
        System.out.print("Enter password: ");
        String password = scanner.next().trim();

        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            System.out.println("Login successful!");
            manageFinance(username);
        } else {
            System.out.println("Invalid credentials!");
        }
    }

    private void manageFinance(String username) {
        FinanceManager financeManager = new FinanceManager();

        while (true) {
            System.out.println("\nFinance Management Menu:");
            System.out.println("1. Add Income\n2. Add Expense\n3. View Balance\n4. Generate Report\n5. Logout");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTransaction(financeManager, true);
                    break;
                case 2:
                    addTransaction(financeManager, false);
                    break;
                case 3:
                    viewBalance(financeManager);
                    break;
                case 4:
                    generateReport(financeManager);
                    break;
                case 5:
                    return; 
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private void addTransaction(FinanceManager financeManager, boolean isIncome) {
        try {
            System.out.print("Enter description: ");
            scanner.nextLine(); 
            String description = scanner.nextLine().trim();

            if (description.isEmpty()) {
                throw new IllegalArgumentException("Error: Description cannot be empty.");
            }

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException("Error: Amount must be positive.");
            }

            System.out.print("Enter category (e.g., Food, Rent, Miscellaneous): ");
            String category = scanner.next().trim();

            if (isIncome) {
                financeManager.addIncome(description, amount, category);
                System.out.println("Income added successfully!");
            } else {
                financeManager.addExpense(description, amount, category);
                System.out.println("Expense added successfully!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        }
    }

    private void viewBalance(FinanceManager financeManager) {
        double balance = financeManager.calculateBalance();
        System.out.printf("Your current balance is: %.2f\n", balance);
    }

    private void generateReport(FinanceManager financeManager) {
        ReportGenerator reportGenerator = new ReportGenerator(financeManager);
        reportGenerator.generateReport();
    }
}
