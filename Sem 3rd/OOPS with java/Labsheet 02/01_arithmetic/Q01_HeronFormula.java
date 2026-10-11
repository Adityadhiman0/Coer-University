import java.util.Scanner;

public class Q01_HeronFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("These sides cannot form a triangle.");
        } else {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area = %.2f%n", area);
        }
        sc.close();
    }
}
