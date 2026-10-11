import java.util.Scanner;
public class MultipleCatchDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first integer: ");
            int a = Integer.parseInt(sc.next());
            System.out.print("Enter second integer: ");
            int b = Integer.parseInt(sc.next());
            System.out.println("Result = " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("Input must be an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Denominator cannot be zero.");
        }
    }
}
