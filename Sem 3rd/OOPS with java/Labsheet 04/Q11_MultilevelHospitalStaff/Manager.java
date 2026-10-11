// Level 2 of the chain: Manager extends Employee, which extends Person
// Manager receives displayPersonDetails() and displayEmployeeDetails() through the chain
public class Manager extends Employee {
    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public void displayManagerDetails() {
        displayEmployeeDetails(); // inherited via Employee, which inherited via Person
        System.out.println("Department : " + department);
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting for the " + department + " department.");
    }
}
