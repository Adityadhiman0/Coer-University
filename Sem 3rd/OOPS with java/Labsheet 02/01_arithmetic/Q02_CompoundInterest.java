import java.util.Scanner;

public class Q02_CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, rate (%), time (years): ");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double amount = p * Math.pow(1 + r / 100, t);
        System.out.printf("Amount = %.2f%nCompound Interest = %.2f%n", amount, amount - p);
        sc.close();
    }
}
