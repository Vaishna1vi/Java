import java.util.Scanner;

public class BubbleSort {

    public void bubbleSort(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = s.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array element: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("The unsorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        BubbleSort b = new BubbleSort();
        b.bubbleSort(n, ar);
        System.out.println("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        s.close();
    }
}