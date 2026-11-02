import java.util.ArrayList;

// Q6. Circle objects stored in an ArrayList<Shape> (polymorphism).
public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1.0));
        shapes.add(new Circle(2.5));
        shapes.add(new Circle(5.0));
        shapes.add(new Circle(7.2));

        System.out.println("Areas of all circles:");
        for (Shape s : shapes) {
            s.display();   // calls Circle's overridden display() and area()
        }
    }
}
