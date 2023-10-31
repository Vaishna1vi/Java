import java.util.Scanner;

public class maxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        // System.out.println("Enter the row size of array: ");
        // int rows = sc.nextInt();
        // System.out.println("Enter the column size of array: ");
        // int cols = sc.nextInt();
        // int array[][] = new int[rows][cols];
        int array[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // array[i][j] = sc.nextInt();
        // }
        // }
        for (int i = 0; i < size; i++) {
            System.out.format("%2d", array[i]);
        }
        System.out.println();
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        // int minValue = 0, maxValue = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > min) {
                min = array[i];
            }
            if (array[i] < max) {
                max = array[i];
            }
        }
        System.out.println("The min value present in array is: " + max);
        System.out.println("The max value present in array is: " + min);
        System.out.println();
        // for (int i = 0; i < array.length; i++) {
        // for (int j = 0; j < cols; j++) {
        // // if (array[i][j] == min) {
        // // minValue = array[i][j];
        // System.out.println("The min value present in array is: " + min);
        // // } else if (array[i][j] == max) {
        // // maxValue = array[i][j];
        // System.out.println("The max value present in array is: " + max);
        // // }
        // }
        // }
        sc.close();
    }
}
