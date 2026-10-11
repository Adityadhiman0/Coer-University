public class CurrentAccount extends BankAccount {
    // Current accounts commonly allow an overdraft - no minimum-balance floor
    private static final double OVERDRAFT_LIMIT = -1000;

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Current account deposit of " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Current account withdrawal of " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Current account withdrawal denied: overdraft limit of " + OVERDRAFT_LIMIT + " exceeded.");
        }
    }
}
