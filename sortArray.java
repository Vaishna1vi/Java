/* STATEMENT- Sort the elements of array in ascending order. */

import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        System.out.print("Array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        boolean sort = true;
        System.out.print("The sorted array is: ");
        for (int i = 0; i < size - 1; i++) {
            if (a[i] > a[i + 1]) {
                sort = false;
                if(sort){
                    System.out.print(a[i + 1] + " ");
                }
                else {
                    System.out.print(a[i] + " ");
                }
            }

        }

        s.close();
    }
}
