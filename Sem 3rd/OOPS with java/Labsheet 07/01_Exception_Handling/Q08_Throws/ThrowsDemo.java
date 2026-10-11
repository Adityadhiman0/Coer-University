import java.util.Scanner;
public class ThrowsDemo {
    static int readNumber(String text) throws NumberFormatException {
        return Integer.parseInt(text);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = readNumber(sc.next());
            System.out.println("Number = " + n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input.");
        }
    }
}
