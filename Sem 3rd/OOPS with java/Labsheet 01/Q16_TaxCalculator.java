import java.util.Scanner;

public class Q16_TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();
        double tax;
        if (salary <= 250000) {
            tax = 0;
        } else if (salary <= 500000) {
            tax = salary * 0.05;
        } else if (salary <= 1000000) {
            tax = salary * 0.20;
        } else {
            tax = salary * 0.30;
        }
        System.out.println("Salary : " + salary);
        System.out.println("Tax    : " + tax);
        sc.close();
    }
}
