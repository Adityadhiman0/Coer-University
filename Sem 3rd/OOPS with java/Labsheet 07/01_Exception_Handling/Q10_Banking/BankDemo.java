class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) { super(message); }
}
class BankAccount {
    private double balance;
    BankAccount(double balance) { this.balance = balance; }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative.");
        if (amount > balance) throw new InsufficientFundsException("Insufficient balance.");
        balance -= amount;
        System.out.println("Withdrawal successful. Balance = " + balance);
    }
}
public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1200);
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
