import java.util.Scanner;

public class SandClock {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (i = n; i > 0; i--) {
            for (j = 0; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            for (j = 1; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        for (i = 1; i < n; i++) {
            for (j = 0; j <= 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            for (j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
