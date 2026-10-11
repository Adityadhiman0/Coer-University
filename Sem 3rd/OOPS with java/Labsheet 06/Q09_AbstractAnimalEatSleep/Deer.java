public class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("The deer grazes on grass and leaves (herbivore).");
    }

    @Override
    public void sleep() {
        System.out.println("The deer sleeps lightly and stays alert for predators.");
    }
}
