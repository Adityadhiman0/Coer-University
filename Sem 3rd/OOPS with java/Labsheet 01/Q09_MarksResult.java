import java.util.Scanner;

public class Q09_MarksResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject 1 (out of 100): ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks of subject 2 (out of 100): ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks of subject 3 (out of 100): ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = total / 3;
        System.out.println("Total      : " + total + " / 300");
        System.out.printf("Percentage : %.2f%%%n", percentage);

        // Pass only if every subject has >= 40 marks
        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Result     : PASS");
        } else {
            System.out.println("Result     : FAIL");
        }
        sc.close();
    }
}
