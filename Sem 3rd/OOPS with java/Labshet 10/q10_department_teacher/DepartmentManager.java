import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DepartmentManager {
    private ArrayList<Department> departments = new ArrayList<>();
    private HashMap<Department, List<Teacher>> teachersByDept = new HashMap<>();

    public void addDepartment(Department d) {
        departments.add(d);
        teachersByDept.put(d, new ArrayList<>());
        System.out.println("Added department: " + d.getDeptName());
    }

    public void addTeacher(Department d, Teacher t) {
        List<Teacher> list = teachersByDept.get(d);
        if (list == null) {
            System.out.println("Department not found: " + d.getDeptName());
            return;
        }
        list.add(t);
        System.out.println("Added teacher " + t.getTeacherName() + " to " + d.getDeptName());
    }

    public void displayAll() {
        // Iterate the ArrayList so departments print in the order they were added
        for (Department d : departments) {
            d.display();
            List<Teacher> list = teachersByDept.get(d);
            if (list.isEmpty()) {
                System.out.println("  (no teachers)");
            } else {
                for (Teacher t : list) {
                    t.display();
                }
            }
            System.out.println();
        }
    }
}
