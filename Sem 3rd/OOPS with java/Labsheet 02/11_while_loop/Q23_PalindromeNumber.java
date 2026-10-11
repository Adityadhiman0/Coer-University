import java.util.Scanner;

public class Q23_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int t = n, rev = 0;
        while (t > 0) {
            rev = rev * 10 + t % 10;
            t /= 10;
        }
        System.out.println(n + (n == rev ? " is a palindrome." : " is not a palindrome."));
        sc.close();
    }
}
