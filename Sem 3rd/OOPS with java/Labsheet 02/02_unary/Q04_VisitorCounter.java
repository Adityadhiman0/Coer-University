public class Q04_VisitorCounter {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("--- Postfix: value is used first, then changed ---");
        System.out.println("Visitor enters, shown count: " + count++); // prints 0, count becomes 1
        System.out.println("Count now: " + count);

        System.out.println("--- Prefix: value is changed first, then used ---");
        System.out.println("Visitor enters, shown count: " + ++count); // count becomes 2, prints 2

        System.out.println("--- Leaving the store ---");
        System.out.println("Visitor leaves, shown count: " + count--); // prints 2, count becomes 1
        System.out.println("Visitor leaves, shown count: " + --count); // count becomes 0, prints 0

        System.out.println("Visitors currently inside: " + count);
    }
}
