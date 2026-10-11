import java.util.Scanner;

public class Q30_MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // 1. Power of 4 using shift operators:
        //    power of 2 (single set bit) and that bit sits at an even position.
        boolean powerOf2 = n > 0 && (n & (n - 1)) == 0;
        int pos = 0;
        for (int t = n; powerOf2 && t > 1; t >>= 1) pos++;
        boolean powerOf4 = powerOf2 && pos % 2 == 0;
        System.out.println(n + (powerOf4 ? " is a power of 4." : " is NOT a power of 4."));
        if (!powerOf4) { sc.close(); return; }

        // 2. Toggle the 3rd bit (bit index 2) using XOR.
        int toggled = n ^ (1 << 2);
        System.out.println("After toggling 3rd bit: " + toggled
                + " (binary " + Integer.toBinaryString(toggled) + ")");

        // 3 & 4. Multiplication table of n, skip multiples of 6, stop at multiple of 48.
        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 20; i++) {
            int product = n * i;
            if (product % 48 == 0) {          // check first: 48 is also a multiple of 6
                System.out.println("Reached multiple of 48 (" + product + "), stopping.");
                break;
            }
            if (product % 6 == 0) continue;
            System.out.println(n + " x " + i + " = " + product);
        }
        sc.close();
    }
}
