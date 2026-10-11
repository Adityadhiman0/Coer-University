public class Main {
    public static void main(String[] args) {
        // BankAccount account = new BankAccount(0); would NOT compile - abstract class
        BankAccount savings = new SavingsAccount(500);
        BankAccount current = new CurrentAccount(500);

        savings.deposit(200);
        savings.withdraw(550); // would leave 150, which is >= 100 -> allowed
        savings.withdraw(100); // would leave 50, below 100 -> denied

        System.out.println();

        current.deposit(100);
        current.withdraw(1500); // leaves -900, within the -1000 overdraft limit -> allowed
        current.withdraw(200);  // would leave -1100, beyond the limit -> denied
    }
}
