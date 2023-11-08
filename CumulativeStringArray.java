// In this program, we calculate the total length of the string from starting point to the ending point of the strings present in the array as a whole. 

import java.util.Scanner;

public class CumulativeStringArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();
        String ar[] = new String[size];
        System.out.println("Enter the strings in the array: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.next();
        }
        s.close();
        System.out.println("The array of string is: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        int stringLen = 0;
        for (int i = 0; i < ar.length; i++) {
            // stringLen += ar[i].length();
            stringLen = stringLen+ar[i].length();
        }
        System.out.println("The cumulative length of the whole strings present in array is: " + stringLen);
    }
}
