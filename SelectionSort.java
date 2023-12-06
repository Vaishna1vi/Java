import java.util.Scanner;

public class SelectionSort {

    public static int[] selectionSort(int n, int[] a) {
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = s.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("The unsorted array is: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        selectionSort(n, ar);
        System.out.println("The sorted array is: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        s.close();
    }
}
