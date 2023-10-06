import java.util.Scanner;

public class hollowButterflyShape {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == i || j == 0 || j == (2 * n - (i + 1)) || j == ((2 * n) - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < (2 * n); j++) {
                if (j == i - 1 || j == (2 * n - i) || j == 0 || j == ((2 * n) - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
