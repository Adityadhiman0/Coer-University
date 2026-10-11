// Hierarchical inheritance: Doctor is one of two children of Employee
public class Doctor extends Employee {
    private String specialization;

    public Doctor(String name, double salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }

    public void treatPatient(String patientName) {
        System.out.println("Dr. " + name + " is treating " + patientName
                + " (Specialization: " + specialization + ")");
    }
}
