/*
 * MULTIPLE INHERITANCE - CONCEPT ONLY
 * ------------------------------------
 * "Multiple inheritance" means a class inherits from more than one
 * parent class at the same time, for example:
 *
 *     class Child extends Parent1, Parent2 { }   // <-- NOT legal Java
 *
 * Java deliberately does NOT allow a class to extend two classes.
 * This file explains why, using the classic "diamond problem".
 *
 * Imagine two parent classes that both define a method with the
 * same signature:
 */
class Projector {
    void display() {
        System.out.println("Projector is displaying the image.");
    }
}

class Printer {
    // Same method name/signature as Projector.display()
    void display() {
        System.out.println("Printer is displaying the document.");
    }
}

/*
 * If Java allowed this:
 *
 *     class MultiFunctionDevice extends Projector, Printer { }
 *
 * then calling:
 *
 *     MultiFunctionDevice device = new MultiFunctionDevice();
 *     device.display();
 *
 * would be ambiguous - the compiler would have no way of knowing
 * whether to run Projector's display() or Printer's display().
 * This is called the "Diamond Problem".
 *
 * To avoid this ambiguity completely, Java only allows a class to
 * extend ONE parent class (single inheritance of state and
 * implementation). The line below is commented out because it would
 * NOT compile - uncommenting it causes a compile-time error:
 *
 *     class MultiFunctionDevice extends Projector, Printer { }
 *     // error: '{' expected   (Java only allows one class after extends)
 *
 * (Java later reintroduces a safe, limited form of "multiple
 * inheritance of type" through interfaces, where a class can
 * implement several interfaces - but the lab sheet asks us not to
 * use interfaces yet, so that solution is left for a later exercise.)
 */
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Projector projector = new Projector();
        Printer printer = new Printer();

        System.out.println("Each class works fine on its own:");
        projector.display();
        printer.display();

        System.out.println("\nBut a single class cannot extend both Projector and");
        System.out.println("Printer in Java - see the comments in this file for why.");
    }
}
