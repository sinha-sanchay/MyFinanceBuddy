class ReportGenerator {
    private FinanceManager financeManager;

    public ReportGenerator(FinanceManager financeManager) {
        this.financeManager = financeManager;
    }

    public void generateReport() {
        double totalIncome = financeManager.calculateTotalIncome();
        double totalExpenses = financeManager.calculateTotalExpenses();
        double balance = financeManager.calculateBalance();

        System.out.println("\n==================== Financial Report ====================");

        System.out.printf("\nTotal Income: %.2f\n", totalIncome);
        if (!financeManager.getIncomes().isEmpty()) {
            System.out.println("\nIncome Details:");
            financeManager.getIncomes().forEach(income -> 
                System.out.printf("  - %s (Category: %s): %.2f\n", income.getDescription(), income.getCategory(), income.getAmount())
            );
        } else {
            System.out.println("  No income recorded.");
        }

        System.out.printf("\nTotal Expenses: %.2f\n", totalExpenses);
        if (!financeManager.getExpenses().isEmpty()) {
            System.out.println("\nExpense Details:");
            financeManager.getExpenses().forEach(expense -> 
                System.out.printf("  - %s (Category: %s): %.2f\n", expense.getDescription(), expense.getCategory(), expense.getAmount())
            );
        } else {
            System.out.println("  No expenses recorded.");
        }

        System.out.printf("\nCurrent Balance: %.2f\n", balance);
        if (balance < 0) {
            System.out.println("  Warning: You are in debt. Please manage your expenses.");
        } else if (balance == 0) {
            System.out.println("  ");
        } else {
            System.out.println("  You're balanced. Keep it up.");
        }

        System.out.println("\n===========================================================");
    }
}
