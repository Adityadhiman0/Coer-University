// Hierarchical inheritance: Pharmacist is the other child of Employee
public class Pharmacist extends Employee {
    private String licenseNumber;

    public Pharmacist(String name, double salary, String licenseNumber) {
        super(name, salary);
        this.licenseNumber = licenseNumber;
    }

    public void dispenseMedicine(String medicineName) {
        System.out.println(name + " dispensed " + medicineName + " (License: " + licenseNumber + ")");
    }
}
