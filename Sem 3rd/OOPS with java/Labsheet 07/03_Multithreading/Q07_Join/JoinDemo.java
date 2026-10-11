public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            for (int i = 1; i <= 3; i++) System.out.println("Worker " + i);
        });
        worker.start();
        worker.join();
        System.out.println("Worker finished; main continues.");
    }
}
