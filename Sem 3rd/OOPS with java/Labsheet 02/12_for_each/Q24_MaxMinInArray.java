import java.util.Scanner;

public class Q24_MaxMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        sc.close();
    }
}
