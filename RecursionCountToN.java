import java.util.Scanner;

public class RecursionCountToN {
    public static void printNum(int cnt, int n) {
        if (cnt > n) {
            // System.out.println("Invalid range");
            if (cnt == n) {
                System.out.println(cnt);
                return;
            }
            System.out.print(cnt-- + " ");
            printNum(cnt, n);
        } else {
            if (cnt == n) {
                System.out.print(cnt);
                return;
            }
            System.out.print(cnt++ + " ");
            printNum(cnt, n);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the initial value: ");
        int st = s.nextInt();
        System.out.println("Enter the last value: ");
        int e = s.nextInt();
        System.out.println("The counting in the range given will be: ");
        printNum(st, e);
        s.close();
    }
}
