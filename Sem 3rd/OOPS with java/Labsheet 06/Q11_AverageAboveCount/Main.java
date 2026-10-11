import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextDouble();
        }

        NumberAnalyzer analyzer = new NumberAnalyzer(numbers);
        analyzer.computeAverage();

        System.out.println("Average: " + analyzer.getAverage());
        System.out.println("Numbers above average: " + analyzer.countAboveAverage());

        sc.close();
    }
}
