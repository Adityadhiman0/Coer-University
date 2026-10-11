public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal(); would NOT compile - Animal is abstract
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();
        tiger.sound();
    }
}
