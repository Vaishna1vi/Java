import java.util.Scanner;

public class MissingElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < size-1; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]==0) {
                System.out.println("Array must contain number from 1. It cannot contain 0.");
                System.out.println("Please insert again all proper values.");
                break;
            }
        }
        System.out.print("Array is: ");
        for(int i=0; i<size-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        MissingElementArray miss = new MissingElementArray();
        int ans = miss.missingNum(arr, size);
        System.out.println("The missing element in the array is: " + ans);
        sc.close();
    }

    public int missingNum(int a[], int n) {
        n =a.length;
        int s = n * (n + 1) / 2;
        int sum = a[0];
        for (int i = 0; i < n-1; i++) {
            sum = sum + a[i+1];
        }
        int missing = s - sum;
        return missing;
    }
}
