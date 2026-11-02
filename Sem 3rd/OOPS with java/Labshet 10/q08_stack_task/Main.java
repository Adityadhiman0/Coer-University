// Q8. Task management simulated with Stack<Task>.
public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        System.out.println("--- Pushing tasks ---");
        manager.pushTask(new Task(1, "Write lab report"));
        manager.pushTask(new Task(2, "Complete assignment"));
        manager.pushTask(new Task(3, "Prepare for viva"));
        manager.pushTask(new Task(4, "Push code to GitHub"));

        System.out.println("\n--- Remaining tasks (top first) ---");
        manager.displayRemaining();

        System.out.println("\n--- Popping completed tasks ---");
        manager.popTask();
        manager.popTask();

        System.out.println("\n--- Remaining tasks (top first) ---");
        manager.displayRemaining();
    }
}
