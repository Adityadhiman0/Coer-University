public class Q18_Fibonacci20 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
