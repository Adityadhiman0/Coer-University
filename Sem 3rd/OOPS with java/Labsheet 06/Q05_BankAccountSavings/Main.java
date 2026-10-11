public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.withdraw(450); // allowed, plain account has no minimum-balance rule

        System.out.println();

        SavingsAccount savings = new SavingsAccount(500);
        savings.deposit(0); // triggers the invalid-amount message
        savings.withdraw(450); // would leave 50, below the 100 minimum -> denied
        savings.withdraw(350); // leaves exactly 150 -> allowed
    }
}
