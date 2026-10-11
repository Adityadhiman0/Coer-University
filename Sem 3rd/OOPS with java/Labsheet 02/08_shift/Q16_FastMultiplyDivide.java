import java.util.Scanner;

public class Q16_FastMultiplyDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and a power of two (n): ");
        int num = sc.nextInt(), n = sc.nextInt();
        System.out.println(num + " * 2^" + n + " = " + (num << n));
        System.out.println(num + " / 2^" + n + " = " + (num >> n));
        sc.close();
    }
}
