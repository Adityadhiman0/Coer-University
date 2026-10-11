// Multilevel step 2: Manager extends Employee, which extends Person
public class Manager extends Employee {
    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}
