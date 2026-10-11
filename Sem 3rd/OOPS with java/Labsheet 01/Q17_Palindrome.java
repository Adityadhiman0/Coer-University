import java.util.Scanner;

public class Q17_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        long reversed = 0; // long avoids overflow when reversing large ints
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        // type casting long -> int for comparison
        if ((int) reversed == Math.abs(n) && reversed <= Integer.MAX_VALUE) {
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n + " is NOT a Palindrome");
        }
        sc.close();
    }
}
