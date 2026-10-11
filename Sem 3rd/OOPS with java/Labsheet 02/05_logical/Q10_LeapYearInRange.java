import java.util.Scanner;

public class Q10_LeapYearInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter range start and end: ");
        int start = sc.nextInt(), end = sc.nextInt();

        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean inRange = year >= start && year <= end;

        if (leap && inRange) System.out.println(year + " is a leap year and within the range.");
        else System.out.println("Condition not satisfied (leap: " + leap + ", in range: " + inRange + ").");
        sc.close();
    }
}
