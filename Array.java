// Try to initialize array with different ways
import java.util.Scanner;

public class Array {
    public static void main(String a[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = s.nextInt();
            int i;
            int[] arr = new int[n];
      // int arr[] = { 1, 2, 3, 4, 5 };
            // int ar[] = new int[5];
            // arr[0] = 2;
            // arr[1] = 4;
            // arr[2] = 6;
            // arr[3] = 1;
            // arr[4] = 3;
            System.out.println("Enter the array elements: ");
            for(i=0; i<n; i++) {
                arr[i] = s.nextInt();
            }
            s.close();
            System.out.println("The array elements are: ");
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
