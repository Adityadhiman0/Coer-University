public class Q25_AverageMarks2D {
    public static void main(String[] args) {
        int[][] marks = {
            {78, 85, 90},
            {65, 70, 72},
            {88, 92, 95},
            {55, 60, 58}
        };
        int student = 1;
        for (int[] row : marks) {
            int sum = 0;
            for (int m : row) sum += m;
            System.out.printf("Student %d average = %.2f%n", student++, (double) sum / row.length);
        }
    }
}
