import java.util.Scanner;

public class Q17_RotateLeftBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int rotated = (n << 2) | (n >>> 30); // int has 32 bits
        System.out.println("Before: " + String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println("After : " + String.format("%32s", Integer.toBinaryString(rotated)).replace(' ', '0'));
        System.out.println("Rotated value = " + rotated);
        sc.close();
    }
}
