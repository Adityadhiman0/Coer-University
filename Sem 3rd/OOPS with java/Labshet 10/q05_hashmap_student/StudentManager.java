import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    // key = roll number, value = student name
    private HashMap<Integer, String> students = new HashMap<>();

    public void addStudent(Student s) {
        if (students.containsKey(s.getRollNo())) {
            System.out.println("Roll no " + s.getRollNo() + " already exists. Not added.");
            return;
        }
        students.put(s.getRollNo(), s.getName());
        System.out.println("Added: " + s.getRollNo() + " -> " + s.getName());
    }

    public void removeStudent(int rollNo) {
        String removed = students.remove(rollNo);
        if (removed != null) {
            System.out.println("Removed roll no " + rollNo + " (" + removed + ")");
        } else {
            System.out.println("Roll no " + rollNo + " not found.");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students.");
            return;
        }
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            // Rebuild a Student object from the key-value pair and use its display method
            Student s = new Student(entry.getKey(), entry.getValue());
            s.display();
        }
    }
}
