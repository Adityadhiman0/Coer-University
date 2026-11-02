// Q2. Inheritance (Person -> Employee) with LinkedList<Employee>.
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        System.out.println("--- Adding employees ---");
        manager.addEmployee(new Employee("Rahul", 28, 1001, 45000));
        manager.addEmployee(new Employee("Priya", 32, 1002, 62000));
        manager.addEmployee(new Employee("Amit", 25, 1003, 38000));
        manager.addEmployee(new Employee("Sneha", 30, 1004, 55000));

        System.out.println("\n--- All employees ---");
        manager.displayEmployees();

        System.out.println("\n--- Searching by name ---");
        manager.searchByName("Priya");
        manager.searchByName("Vikram");
    }
}
