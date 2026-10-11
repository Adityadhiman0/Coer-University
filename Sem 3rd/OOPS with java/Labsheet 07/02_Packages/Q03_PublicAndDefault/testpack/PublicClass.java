package testpack;
public class PublicClass {
    public void show() { System.out.println("Public class is accessible outside the package."); }
}
class HiddenClass {
    void show() { System.out.println("Package-private class is accessible only inside testpack."); }
}
