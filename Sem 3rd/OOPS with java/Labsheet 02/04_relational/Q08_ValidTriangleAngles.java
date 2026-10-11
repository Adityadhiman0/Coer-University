import java.util.Scanner;

public class Q08_ValidTriangleAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        boolean valid = (a > 0) && (b > 0) && (c > 0) && (a + b + c == 180);
        System.out.println(valid ? "Valid triangle." : "Not a valid triangle.");
        sc.close();
    }
}
