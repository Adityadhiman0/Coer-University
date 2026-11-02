public class Task {
    private int taskId;
    private String description;

    public Task(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public void display() {
        System.out.println("Task ID: " + taskId + ", Description: " + description);
    }
}
