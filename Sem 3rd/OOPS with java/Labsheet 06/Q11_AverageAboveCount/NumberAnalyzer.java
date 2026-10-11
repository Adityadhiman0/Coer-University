import java.util.Scanner;

public class NumberAnalyzer {
    private double[] numbers;
    private double average;

    public NumberAnalyzer(double[] numbers) {
        this.numbers = numbers; // 'this' distinguishes the field from the parameter
    }

    // Computes and stores the average in this.average
    public void computeAverage() {
        double total = 0;
        for (double value : this.numbers) {
            total += value;
        }
        this.average = total / this.numbers.length;
    }

    public double getAverage() {
        return this.average;
    }

    // Counts how many of this object's numbers are above this.average
    public int countAboveAverage() {
        int count = 0;
        for (double value : this.numbers) {
            if (value > this.average) {
                count++;
            }
        }
        return count;
    }
}
