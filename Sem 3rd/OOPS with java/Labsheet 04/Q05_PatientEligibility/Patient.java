public class Patient {
    private String name;
    private int age;
    private boolean hasInsurance;

    public Patient(String name, int age, boolean hasInsurance) {
        this.name = name;
        this.age = age;
        this.hasInsurance = hasInsurance;
    }

    // if-else classification lives inside the Patient method
    public void checkEligibility() {
        System.out.println("Patient: " + name + " (age " + age + ")");
        if (age < 12) {
            System.out.println("Category: Pediatric patient - requires guardian consent.");
        } else if (age >= 60) {
            System.out.println("Category: Senior citizen - eligible for priority care.");
        } else if (hasInsurance) {
            System.out.println("Category: Adult, insured - standard billing applies.");
        } else {
            System.out.println("Category: Adult, uninsured - advance payment required.");
        }
    }
}
