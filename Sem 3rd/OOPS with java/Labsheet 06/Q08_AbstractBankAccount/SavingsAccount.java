public class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 100;

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Savings deposit of " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Savings withdrawal of " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Savings withdrawal denied: balance cannot fall below " + MINIMUM_BALANCE + ".");
        }
    }
}
