import java.util.Scanner;

public class Q05_NegativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("Negative using unary minus : " + (-n));
        System.out.println("Negative using ~n + 1      : " + (~n + 1));
        sc.close();
    }
}
