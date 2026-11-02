import java.util.LinkedList;

public class EmployeeManager {
    private LinkedList<Employee> employees = new LinkedList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Added: " + e.getName());
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employee records.");
            return;
        }
        for (Employee e : employees) {
            e.display();
        }
    }

    // Search by name (case-insensitive); returns true if at least one is found
    public boolean searchByName(String name) {
        boolean found = false;
        for (Employee e : employees) {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.print("Found -> ");
                e.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employee named \"" + name + "\" found.");
        }
        return found;
    }
}
