// Single inheritance: Pharmacist extends one parent class, Employee
public class Pharmacist extends Employee {
    private String licenseNumber;

    public Pharmacist(String name, double salary, String licenseNumber) {
        super(name, salary); // reuses the parent constructor
        this.licenseNumber = licenseNumber;
    }

    public void dispenseMedicine(String medicineName) {
        System.out.println(name + " dispensed " + medicineName + " to a patient.");
    }

    public void displayPharmacistDetails() {
        displayEmployeeDetails(); // inherited behavior
        System.out.println("License: " + licenseNumber);
    }
}
