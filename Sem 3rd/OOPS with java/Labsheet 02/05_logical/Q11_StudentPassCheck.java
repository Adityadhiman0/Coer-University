import java.util.Scanner;

public class Q11_StudentPassCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter theory % and practical %: ");
        double theory = sc.nextDouble(), practical = sc.nextDouble();
        double overall = (theory + practical) / 2;

        // (theory >= 40 AND practical >= 50) OR overall >= 50
        boolean pass = (theory >= 40 && practical >= 50) || overall >= 50;
        System.out.printf("Overall: %.2f%%%n", overall);
        System.out.println(pass ? "Result: PASS" : "Result: FAIL");
        sc.close();
    }
}
