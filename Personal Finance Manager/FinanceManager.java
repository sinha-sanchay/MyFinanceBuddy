import java.util.ArrayList;
import java.util.List;

class FinanceManager {
    private List<Transaction> incomes = new ArrayList<>();
    private List<Transaction> expenses = new ArrayList<>();

    public void addIncome(String description, double amount, String category) {
        incomes.add(new Transaction(description, amount, category));
    }

    public void addExpense(String description, double amount, String category) {
        expenses.add(new Transaction(description, amount, category));
    }

    public List<Transaction> getIncomes() {
        return incomes;
    }

    public List<Transaction> getExpenses() {
        return expenses;
    }

    public double calculateTotalIncome() {
        return incomes.stream().mapToDouble(Transaction::getAmount).sum();
    }

    public double calculateTotalExpenses() {
        return expenses.stream().mapToDouble(Transaction::getAmount).sum();
    }

    public double calculateBalance() {
        return calculateTotalIncome() - calculateTotalExpenses();
    }
}
