// Hierarchical: Doctor is one child of Employee
public class Doctor extends Employee {
    private String specialization;

    public Doctor(String name, int age, double salary, String specialization) {
        super(name, age, salary);
        this.specialization = specialization;
    }

    public void work() {
        System.out.println("Dr. " + name + " is treating patients (" + specialization + ").");
    }
}
