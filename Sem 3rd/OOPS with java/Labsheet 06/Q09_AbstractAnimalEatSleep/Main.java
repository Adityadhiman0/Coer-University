public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Lion(), new Tiger(), new Deer() };

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            System.out.println();
        }
    }
}
