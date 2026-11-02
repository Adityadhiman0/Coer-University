// Q5. HashMap stores roll number (key) and name (value).
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        System.out.println("--- Adding students ---");
        manager.addStudent(new Student(1, "Aarav"));
        manager.addStudent(new Student(2, "Diya"));
        manager.addStudent(new Student(3, "Kabir"));
        manager.addStudent(new Student(2, "Duplicate Roll"));

        System.out.println("\n--- All students ---");
        manager.displayStudents();

        System.out.println("\n--- Removing students ---");
        manager.removeStudent(2);
        manager.removeStudent(9);

        System.out.println("\n--- After removal ---");
        manager.displayStudents();
    }
}
