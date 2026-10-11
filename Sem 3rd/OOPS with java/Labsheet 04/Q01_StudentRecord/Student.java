public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // All display logic lives here, not in main
    public void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
    }
}
