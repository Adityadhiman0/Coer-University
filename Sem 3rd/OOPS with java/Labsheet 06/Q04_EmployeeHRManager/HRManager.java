public class HRManager extends Employee {
    public HRManager(String name, double salary) {
        super(name, salary);
    }

    // Overrides the parent's work()
    @Override
    public void work() {
        System.out.println(name + " is managing HR activities and interviews.");
    }

    // A new method that only HRManager has - not present in Employee
    public void addEmployee(String newEmployeeName) {
        System.out.println(name + " added a new employee: " + newEmployeeName);
    }
}
