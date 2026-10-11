public class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 100;

    public SavingsAccount(double balance) {
        super(balance);
    }

    // Overridden to add the minimum-balance rule a plain BankAccount does not have
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal denied: amount must be positive.");
        } else if (balance - amount < MINIMUM_BALANCE) {
            System.out.println("Withdrawal denied: balance cannot fall below " + MINIMUM_BALANCE
                    + " in a savings account.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Balance: " + balance);
        }
    }
}
