import java.util.Stack;

public class TaskManager {
    private Stack<Task> tasks = new Stack<>();

    public void pushTask(Task t) {
        tasks.push(t);
        System.out.println("Pushed task " + t.getTaskId() + ": " + t.getDescription());
    }

    // Completes the most recently added task (LIFO)
    public void popTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to complete.");
            return;
        }
        Task done = tasks.pop();
        System.out.println("Completed task " + done.getTaskId() + ": " + done.getDescription());
    }

    public void displayRemaining() {
        if (tasks.isEmpty()) {
            System.out.println("No remaining tasks.");
            return;
        }
        // Print from top of stack down to the bottom
        for (int i = tasks.size() - 1; i >= 0; i--) {
            tasks.get(i).display();
        }
    }
}
