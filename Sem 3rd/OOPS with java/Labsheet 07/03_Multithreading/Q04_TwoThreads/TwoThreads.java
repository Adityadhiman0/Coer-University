public class TwoThreads {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 3; i++)
                System.out.println(Thread.currentThread().getName() + " : " + i);
        };
        new Thread(task, "Thread-A").start();
        new Thread(task, "Thread-B").start();
    }
}
