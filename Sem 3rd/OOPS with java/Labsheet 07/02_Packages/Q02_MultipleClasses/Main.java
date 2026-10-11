import shapes.Circle;
import shapes.Rectangle;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Circle area = %.2f%n", new Circle(3).area());
        System.out.println("Rectangle area = " + new Rectangle(4, 5).area());
    }
}
