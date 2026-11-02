// Q9. Patients served in FIFO order using Queue<Patient> backed by LinkedList.
public class Main {
    public static void main(String[] args) {
        PatientQueue clinic = new PatientQueue();

        System.out.println("--- Patients arriving ---");
        clinic.addPatient(new Patient(1, "Ramesh"));
        clinic.addPatient(new Patient(2, "Sita"));
        clinic.addPatient(new Patient(3, "Mohan"));
        clinic.addPatient(new Patient(4, "Geeta"));

        System.out.println("\n--- Waiting list ---");
        clinic.displayWaiting();

        System.out.println("\n--- Serving patients ---");
        clinic.servePatient();
        clinic.servePatient();

        System.out.println("\n--- Waiting list ---");
        clinic.displayWaiting();

        System.out.println("\n--- Serving the rest ---");
        clinic.servePatient();
        clinic.servePatient();
        clinic.servePatient();   // queue is empty now
    }
}
