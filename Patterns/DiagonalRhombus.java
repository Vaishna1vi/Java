import java.util.Scanner;

public class DiagonalRhombus {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                // if(j==0||j==i) [for vertical diagonal]
                // if (j == 0 || i == n - 1) [for horizontal diagonal]
                if (j == 0 || j == i || i == n - 1) // [for both diagonal]
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (j = 0; j < i; j++) {
                // if(j==i-1) [for vertical diagonal]
                // if (j == i - 1 || i == n - 1) [for horizontal diagonal]
                if (j == i - 1 || i == n - 1) // [for both diagonal]
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for (i = n; i > 0; i--) {
            if (i != n) {
                for (j = 0; j <= 2 * (n - i); j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++) {
                    // if(j==1||j==i) [for vertical diagonal]
                    // if (j == 1) [for horizontal diagonal]
                    if (j == 1 || j == i) // [for both diagonal]
                    {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }
                }
                for (j = 1; j < i; j++) {
                    // if(j==i-1) [for vertical diagonal]
                    // if (j == i - 1) [for horizontal diagonal]
                    if (j == i - 1) // [for both diagonal]
                    {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
        }
        sc.close();
    }
}
