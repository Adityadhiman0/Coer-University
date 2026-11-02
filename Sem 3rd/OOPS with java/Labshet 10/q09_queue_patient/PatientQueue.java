import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    // Queue interface reference, LinkedList implementation
    private Queue<Patient> queue = new LinkedList<>();

    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println("Added to queue: " + p.getName() + " (ID " + p.getId() + ")");
    }

    // Serves the patient who has been waiting the longest (FIFO)
    public void servePatient() {
        Patient p = queue.poll();
        if (p == null) {
            System.out.println("No patients waiting.");
        } else {
            System.out.println("Serving: " + p.getName() + " (ID " + p.getId() + ")");
        }
    }

    public void displayWaiting() {
        if (queue.isEmpty()) {
            System.out.println("No patients waiting.");
            return;
        }
        for (Patient p : queue) {
            p.display();
        }
    }
}
