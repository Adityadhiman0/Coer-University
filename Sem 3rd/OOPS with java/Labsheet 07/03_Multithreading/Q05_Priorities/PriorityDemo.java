public class PriorityDemo {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println(Thread.currentThread().getName()
                + " priority=" + Thread.currentThread().getPriority());
        Thread low = new Thread(task, "Low");
        Thread normal = new Thread(task, "Normal");
        Thread high = new Thread(task, "High");
        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        low.start(); normal.start(); high.start();
    }
}
