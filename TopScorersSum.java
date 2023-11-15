import java.util.*;

public class TopScorersSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int k = s.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        topSum(a, k, n);
        s.close();
    }

    static int topSum(int ar[], int k, int n) {
        int sum = 0;
        Arrays.sort(ar);
        System.out.println("The sum of top" + k + "scorers is: ");
        for (int i = ar.length - 1; i >= ar.length - k; i--) {
            sum += ar[i];
        }
        return sum;
    }
}
