import java.util.ArrayList;

// Q1. Store and display a list of student names using an ArrayList.
public class Main {
    static void displayAll(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("  (no students)");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print("  " + (i + 1) + ". ");
            list.get(i).display();
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding
        System.out.println("--- Adding students ---");
        students.add(new Student("Aarav"));
        students.add(new Student("Diya"));
        students.add(new Student("Kabir"));
        students.add(new Student("Meera"));
        students.add(new Student("Rohan"));
        displayAll(students);

        // Removing (by index)
        System.out.println("\n--- Removing the student at index 1 ---");
        students.remove(1);
        displayAll(students);

        // Removing (by name)
        System.out.println("\n--- Removing student named Kabir ---");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals("Kabir")) {
                students.remove(i);
                break;
            }
        }
        displayAll(students);

        System.out.println("\nTotal students: " + students.size());
    }
}
