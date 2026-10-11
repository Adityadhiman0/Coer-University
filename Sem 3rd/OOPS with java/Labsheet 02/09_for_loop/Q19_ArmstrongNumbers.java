public class Q19_ArmstrongNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int digits = String.valueOf(i).length();
            int sum = 0;
            for (int t = i; t > 0; t /= 10) {
                sum += (int) Math.pow(t % 10, digits);
            }
            if (sum == i) System.out.print(i + " ");
        }
        System.out.println();
    }
}
