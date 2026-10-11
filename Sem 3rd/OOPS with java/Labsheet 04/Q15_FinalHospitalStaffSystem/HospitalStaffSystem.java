public class HospitalStaffSystem {
    // Array + loop belong to the system class, matching Q4's Inventory style
    private Employee[] staff;

    public HospitalStaffSystem() {
        staff = new Employee[]{
            new Doctor("Arvind Rao", 45, 90000, "Cardiology"),
            new Pharmacist("Neha Joshi", 29, 45000, "PH-20260055"),
            new Manager("Sanjay Mehra", 42, 120000, "Administration")
        };
    }

    // The one method main calls - everything else happens inside the system
    public void runDailyOperations() {
        System.out.println("=== Hospital Staff - Daily Operations ===");
        for (Employee employee : staff) {
            employee.displayEmployeeDetails();

            // if-else classification, echoing Q5's Patient style
            if (employee instanceof Doctor doctor) {
                doctor.work();
            } else if (employee instanceof Pharmacist pharmacist) {
                pharmacist.work();
            } else if (employee instanceof Manager manager) {
                manager.work();
            }
            System.out.println();
        }

        // A small encapsulated change, through the setter only
        staff[0].setSalary(95000);
        System.out.println("After a raise, " + staff[0].getSalary());
    }
}
