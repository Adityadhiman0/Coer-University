import java.util.Scanner;

public class Q05_FloatToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        float f = sc.nextFloat();
        int i = (int) f; // explicit type casting (fractional part is truncated)
        System.out.println("Original value  : " + f);
        System.out.println("Converted value : " + i);
        sc.close();
    }
}
