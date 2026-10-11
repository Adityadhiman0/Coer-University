public class Car extends Vehicle {
    // Overridden exactly as question 2 asks - prints "Repairing a car"
    // rather than anything about driving.
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
