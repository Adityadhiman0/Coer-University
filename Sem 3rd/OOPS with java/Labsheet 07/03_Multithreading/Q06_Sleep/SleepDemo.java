public class SleepDemo {
    public static void main(String[] args) {
        Thread sleeper = new Thread(() -> {
            try {
                System.out.println("Sleeper starts");
                Thread.sleep(2000);
                System.out.println("Sleeper resumes");
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });
        sleeper.start();
        System.out.println("Main thread continues");
    }
}
