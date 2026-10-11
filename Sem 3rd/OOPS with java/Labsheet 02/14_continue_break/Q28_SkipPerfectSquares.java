public class Q28_SkipPerfectSquares {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);
            if (root * root == i) continue; // perfect square, skip it
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
