import java.util.Arrays;
import java.util.Scanner;

public class matchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        long[] a = new long[size];
        long[] b = new long[size];

        System.out.println("Enter the elements of 1st array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        System.out.println("Enter the elements of 2nd array: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextLong();
        }

        System.out.print("Array 'a' is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Array 'b' is: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        matchArray m = new matchArray();
        System.out.println(m.equalArray(a, b, size));
        sc.close();
    }

    public boolean equalArray(long a[], long b[], int n) {
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("Both array elements are equal? ");
        boolean ans;

        if (Arrays.equals(a, b)) {
            ans = true;
        } else {
            ans = false;
        }
        return ans;
    }
}