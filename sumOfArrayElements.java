import java.util.Scanner;

public class sumOfArrayElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int max = s.nextInt();

        int arr[] = new int[max];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < max; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // int sum = 0;
        int sum = arr[0]; // alternative way
        for (int i = 0; i < max; i++) {
            sum = sum + arr[i];
        }
        int ans = sum - arr[0]; // alternative way
        // System.out.print("The sum of the elements present in the array is: " + sum);
        System.out.print("The sum of the elements present in the array is: " + ans); // alternative way
        s.close();
    }
}
