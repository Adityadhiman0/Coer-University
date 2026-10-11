import java.util.ArrayList;
import java.util.Scanner;
public class ListDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter number: ");
                numbers.add(sc.nextInt());
            }
            System.out.println("Numbers = " + numbers);
        }
    }
}
