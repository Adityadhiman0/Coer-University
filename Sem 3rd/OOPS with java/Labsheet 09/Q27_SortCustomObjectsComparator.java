import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Q27. Sort an ArrayList of custom objects using Comparator.
class Student27 {
    private int rollNo;
    private String name;
    private double marks;

    Student27(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int getRollNo() { return rollNo; }
    String getName() { return name; }
    double getMarks() { return marks; }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

// Comparator that sorts students by marks (highest first)
class MarksComparator implements Comparator<Student27> {
    @Override
    public int compare(Student27 a, Student27 b) {
        return Double.compare(b.getMarks(), a.getMarks());
    }
}

public class Q27_SortCustomObjectsComparator {
    public static void main(String[] args) {
        ArrayList<Student27> students = new ArrayList<>();
        students.add(new Student27(103, "Kabir", 78.25));
        students.add(new Student27(101, "Aarav", 85.5));
        students.add(new Student27(104, "Meera", 88.75));
        students.add(new Student27(102, "Diya", 92.0));

        System.out.println("Original order:");
        for (Student27 s : students) s.display();

        Collections.sort(students, new MarksComparator());
        System.out.println("\nSorted by marks (highest first):");
        for (Student27 s : students) s.display();

        // Another Comparator, written as a lambda: sort by name (A to Z)
        students.sort((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("\nSorted by name (A to Z):");
        for (Student27 s : students) s.display();
    }
}
