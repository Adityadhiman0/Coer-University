// Multilevel step 1: Employee extends Person
public class Employee extends Person {
    private double salary; // encapsulated - private with controlled access

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary ignored for " + name);
        }
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Salary : " + salary);
    }
}
