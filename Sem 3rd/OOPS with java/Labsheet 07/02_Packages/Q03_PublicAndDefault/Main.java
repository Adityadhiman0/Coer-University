import testpack.PublicClass;
public class Main {
    public static void main(String[] args) {
        new PublicClass().show();
        // HiddenClass cannot be referenced here because it is package-private.
    }
}
