public class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Parent provides a default; each child overrides this with its own formula
    public double calculateArea() {
        return 0;
    }

    public void display() {
        System.out.println(name + " area = " + calculateArea());
    }
}
