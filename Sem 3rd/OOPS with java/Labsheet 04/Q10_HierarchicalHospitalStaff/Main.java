public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Arvind Rao", 90000, "Cardiology");
        Pharmacist pharmacist = new Pharmacist("Neha Joshi", 45000, "PH-20260055");

        doctor.displayEmployeeDetails();
        doctor.treatPatient("Ramesh Gupta");

        System.out.println();

        pharmacist.displayEmployeeDetails();
        pharmacist.dispenseMedicine("Amoxicillin");
    }
}
