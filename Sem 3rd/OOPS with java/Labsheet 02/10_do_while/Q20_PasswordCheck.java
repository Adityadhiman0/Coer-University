import java.util.Scanner;

public class Q20_PasswordCheck {
    public static void main(String[] args) {
        final String PASSWORD = "java123";
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter password: ");
            input = sc.nextLine();
            if (!input.equals(PASSWORD)) System.out.println("Wrong password, try again.");
        } while (!input.equals(PASSWORD));
        System.out.println("Access granted!");
        sc.close();
    }
}
