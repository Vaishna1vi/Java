import java.util.Scanner;

public class checkSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ascend = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascend = false;
            }
        }
        if (ascend) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");

        }
        sc.close();
    }
}
