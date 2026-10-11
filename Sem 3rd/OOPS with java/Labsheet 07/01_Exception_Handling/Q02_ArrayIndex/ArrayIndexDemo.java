import java.util.Scanner;
public class ArrayIndexDemo {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();
            System.out.println("Value = " + values[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
    }
}
