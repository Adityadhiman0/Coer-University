import java.util.Scanner;

public class Q13_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        if (n > 0) {
            System.out.println("The number is Positive");
        } else if (n < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
        sc.close();
    }
}
