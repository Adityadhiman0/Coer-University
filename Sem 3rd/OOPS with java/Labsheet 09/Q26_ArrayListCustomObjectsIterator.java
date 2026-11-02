import java.util.ArrayList;
import java.util.Iterator;

// Q26. Create an ArrayList of custom objects (e.g., Student) and iterate using Iterator.
class Student26 {
    private int rollNo;
    private String name;
    private double marks;

    Student26(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Q26_ArrayListCustomObjectsIterator {
    public static void main(String[] args) {
        ArrayList<Student26> students = new ArrayList<>();
        students.add(new Student26(101, "Aarav", 85.5));
        students.add(new Student26(102, "Diya", 92.0));
        students.add(new Student26(103, "Kabir", 78.25));
        students.add(new Student26(104, "Meera", 88.75));

        Iterator<Student26> it = students.iterator();
        System.out.println("Student details:");
        while (it.hasNext()) {
            it.next().display();
        }
    }
}
