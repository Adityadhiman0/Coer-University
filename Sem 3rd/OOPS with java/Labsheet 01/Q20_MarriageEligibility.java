import java.util.Scanner;

public class Q20_MarriageEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (M/F): ");
        char gender = Character.toUpperCase(sc.next().charAt(0));
        if (gender == 'M') {
            if (age >= 21) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible (male must be at least 21)");
            }
        } else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible (female must be at least 18)");
            }
        } else {
            System.out.println("Invalid gender entered.");
        }
        sc.close();
    }
}
