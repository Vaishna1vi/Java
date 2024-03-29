/* PROBLEM OF GFG:- 3. SECOND LARGEST ELEMENT IN ARRAY
 *
 * STATEMENT:- Given an array of size n, print second largest distinct element from an array.
 * 
 * EXAMPLE:-
 * 
 * 1. Input:
 *     N = 6
 *     Arr[] = {12, 35, 1, 10, 34, 1}
 *   
 *    Output: 34
 *    
 *    Explanation: The largest element of the array is 35 and second largest element is 34.
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println(" Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("The Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();

        System.out.println();

        SecondLargestElement scnd = new SecondLargestElement();
        int ans = scnd.SecondLargestInArray(a, n);
        System.out.println("The second largest element in the array is: " + ans);
    }

    public int SecondLargestInArray(int arr[], int n) {
        int second = -1;
        Arrays.sort(arr);
        while (n > 1) {
            if (arr[n - 1] != arr[n - 2]) {
                return arr[n - 2];
            }
            n--;
        }
        return second;
    }
}
