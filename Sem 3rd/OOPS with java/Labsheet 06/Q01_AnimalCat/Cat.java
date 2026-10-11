// The lab sheet asks for Cat to override makeSound() so that it "barks" -
// unusual for a cat, but that is exactly what question 1 specifies, so the
// override below prints a bark rather than a meow.
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}
