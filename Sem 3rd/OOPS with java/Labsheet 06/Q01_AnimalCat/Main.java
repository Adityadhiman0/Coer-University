public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat(); // parent reference, child object - runtime polymorphism

        animal.makeSound();
        cat.makeSound(); // calls Cat's overridden version
    }
}
