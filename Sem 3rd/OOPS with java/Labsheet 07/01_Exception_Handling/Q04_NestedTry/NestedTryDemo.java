public class NestedTryDemo {
    public static void main(String[] args) {
        int[] values = {5, 10, 15};
        try {
            try {
                System.out.println("Array value = " + values[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: invalid array index.");
            }
            System.out.println(12 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: division by zero.");
        }
    }
}
