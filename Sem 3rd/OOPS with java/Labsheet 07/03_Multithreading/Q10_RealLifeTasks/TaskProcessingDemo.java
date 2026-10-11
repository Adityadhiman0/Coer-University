public class TaskProcessingDemo {
    static void process(String name) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " processing item " + i);
            try { Thread.sleep(200); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); return; }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread download = new Thread(() -> process("Download task"));
        Thread report = new Thread(() -> process("Report task"));
        download.start(); report.start();
        download.join(); report.join();
        System.out.println("All tasks complete.");
    }
}
