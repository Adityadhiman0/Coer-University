public class FinallyReturnDemo {
    static int getValue() {
        try {
            return 10;
        } finally {
            System.out.println("finally executes before return completes");
        }
    }
    public static void main(String[] args) {
        System.out.println("Returned value = " + getValue());
    }
}
