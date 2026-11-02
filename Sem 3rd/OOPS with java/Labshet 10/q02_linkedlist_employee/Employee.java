public class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void display() {
        System.out.println("Emp ID: " + empId + ", Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}
