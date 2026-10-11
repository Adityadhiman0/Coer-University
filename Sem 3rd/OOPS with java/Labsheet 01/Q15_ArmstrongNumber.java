import java.util.Scanner;

public class Q15_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();
        if (n < 100 || n > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            int d1 = n / 100;        // hundreds digit
            int d2 = (n / 10) % 10;  // tens digit
            int d3 = n % 10;         // units digit
            int sum = d1 * d1 * d1 + d2 * d2 * d2 + d3 * d3 * d3;
            if (sum == n) {
                System.out.println(n + " is an Armstrong number");
            } else {
                System.out.println(n + " is NOT an Armstrong number");
            }
        }
        sc.close();
    }
}
