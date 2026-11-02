// Q10. ArrayList<Department> + HashMap<Department, List<Teacher>> with inheritance.
public class Main {
    public static void main(String[] args) {
        DepartmentManager manager = new DepartmentManager();

        Department cs = new Department(1, "Computer Science");
        Department math = new Department(2, "Mathematics");
        Department physics = new Department(3, "Physics");

        System.out.println("--- Adding departments ---");
        manager.addDepartment(cs);
        manager.addDepartment(math);
        manager.addDepartment(physics);

        System.out.println("\n--- Adding teachers ---");
        manager.addTeacher(cs, new Teacher(1, "Computer Science", 201, "Dr. Sharma"));
        manager.addTeacher(cs, new Teacher(1, "Computer Science", 202, "Prof. Gupta"));
        manager.addTeacher(math, new Teacher(2, "Mathematics", 203, "Dr. Verma"));

        System.out.println("\n--- Teachers under each department ---");
        manager.displayAll();
    }
}
