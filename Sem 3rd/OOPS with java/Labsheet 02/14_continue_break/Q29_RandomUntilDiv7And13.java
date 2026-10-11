import java.util.Random;

public class Q29_RandomUntilDiv7And13 {
    public static void main(String[] args) {
        Random rand = new Random();
        while (true) {
            int n = rand.nextInt(100) + 1; // 1 to 100
            System.out.println("Generated: " + n);
            if (n % 7 == 0 && n % 13 == 0) {
                System.out.println("Found " + n + ", divisible by both 7 and 13. Stopping.");
                break;
            }
        }
    }
}
