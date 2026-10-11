// Hierarchical: Pharmacist is the other child of Employee
public class Pharmacist extends Employee {
    private String licenseNumber;

    public Pharmacist(String name, int age, double salary, String licenseNumber) {
        super(name, age, salary);
        this.licenseNumber = licenseNumber;
    }

    public void work() {
        System.out.println(name + " is dispensing medicines (License: " + licenseNumber + ").");
    }
}
