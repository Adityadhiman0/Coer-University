public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sneha Kapoor", 1000.0);
        account.display();

        account.deposit(500.0);
        account.deposit(-200.0);   // rejected by validation
        account.withdraw(300.0);
        account.withdraw(5000.0);  // rejected by validation

        System.out.println();
        account.display();
    }
}
