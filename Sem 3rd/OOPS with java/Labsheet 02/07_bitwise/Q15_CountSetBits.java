import java.util.Scanner;

public class Q15_CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n, count = 0;
        while (n != 0) {
            count += n & 1;   // check the lowest bit
            n >>>= 1;         // move to the next bit
        }
        System.out.println("Binary of " + original + " = " + Integer.toBinaryString(original));
        System.out.println("Set bits = " + count);
        sc.close();
    }
}
