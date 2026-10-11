public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3, 4, 5, 4, 3); // 3-4-5 right triangle, base 4, height 3

        System.out.println("Circle   -> Area: " + circle.calculateArea()
                + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Triangle -> Area: " + triangle.calculateArea()
                + ", Perimeter: " + triangle.calculatePerimeter());
    }
}
