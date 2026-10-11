// Level 1 of the chain: Employee extends Person
public class Employee extends Person {
    protected double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonDetails(); // inherited from Person
        System.out.println("Salary : " + salary);
    }
}
