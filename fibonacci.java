import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the series: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The Fibonacci series is: ");
        fib(n);
    }

    public static void fib(int size) {
        int ans, n = 0, m = 1;
        System.out.print(n + " " + m + " ");
        for (int i = 0; i < size; i++) {
            ans = n + m;
            n = m;
            m = ans;
            System.out.print(ans + " ");
        }
        return;
    }
}