/* PROBLEM OF GFG:- 1. FIND DUPLICATE ELEMENT OF ARRAY
 * 
 * STATEMENT:- Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 
 * 
 * EXAMPLE: - 
 * 
 * 1. Input:
 *     N = 4
 *     a[] = {0,3,1,2}
 *     Output: 
 *     -1
 *     Explanation: 
 *     There is no repeating element in the array. Therefore output is -1.
 *     
 * 2. Input:
 *     N = 5
 *     a[] = {2,3,1,2,3}
 *     Output: 
 *     2 3 
 *     Explanation: 
 *     2 and 3 occur more than once in the given array.
 */

import java.util.*;

public class DuplicateElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        DuplicateElementArray dp = new DuplicateElementArray();
        System.out.println(dp.DuplicateElement(arr, size));

        sc.close();
    }

    public ArrayList<Integer> DuplicateElement(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int i, j, cnt = 1;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    if (cnt > 1) {
                        al.add(arr[j]);
                    }
                }
            }
        }
        Collections.sort(al);
        Set<Integer> s = new HashSet<>(al);
        al.clear();
        al.addAll(s);
        if (al.isEmpty()) {
            al.add(-1);
            System.out.println("No repeated elements are found. Hence new array is: ");
        }
        else {
            System.out.println("New array of repeated elements: ");
        }
        return al;
    }
}
