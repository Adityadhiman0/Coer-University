import java.util.Scanner;

public class Q21_FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.print("Factors of " + n + ": ");
        do {
            if (n % i == 0) System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println();
        sc.close();
    }
}
