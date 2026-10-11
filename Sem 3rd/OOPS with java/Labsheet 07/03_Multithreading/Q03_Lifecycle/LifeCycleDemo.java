public class LifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try { Thread.sleep(500); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });
        System.out.println("Before start: " + t.getState()); // NEW
        t.start();
        Thread.sleep(100);
        System.out.println("During sleep: " + t.getState()); // often TIMED_WAITING
        t.join();
        System.out.println("After completion: " + t.getState()); // TERMINATED
    }
}
