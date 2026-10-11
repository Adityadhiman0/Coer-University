public class UnsafeCounterDemo {
    static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> { for (int i = 0; i < 100000; i++) counter++; };
        Thread t1 = new Thread(task), t2 = new Thread(task);
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("Expected 200000; actual = " + counter);
    }
}
