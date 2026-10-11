import java.util.Scanner;

public class Q09_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int len = Math.min(s1.length(), s2.length());
        int result = 0; // 0 equal, -1 s1 first, 1 s2 first
        for (int i = 0; i < len; i++) {
            char c1 = s1.charAt(i), c2 = s2.charAt(i);
            if (c1 < c2) { result = -1; break; }
            if (c1 > c2) { result = 1; break; }
        }
        if (result == 0) {
            if (s1.length() < s2.length()) result = -1;
            else if (s1.length() > s2.length()) result = 1;
        }

        if (result < 0) System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        else if (result > 0) System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
        else System.out.println("Both strings are equal.");
        sc.close();
    }
}
