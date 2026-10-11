public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = (initialBalance >= 0) ? initialBalance : 0;
    }

    // The only way to add money - validates before changing the private balance
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    // The only way to remove money - validates before changing the private balance
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Withdrawal rejected: insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }

    public void display() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}
