import java.util.Scanner;

public class Q22_ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int rev = 0, t = Math.abs(n);
        while (t != 0) {
            rev = rev * 10 + t % 10;
            t /= 10;
        }
        System.out.println("Reversed: " + (n < 0 ? -rev : rev));
        sc.close();
    }
}
