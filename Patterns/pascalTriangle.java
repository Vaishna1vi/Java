import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0)
                    a = 1;
                else
                    a = a * (i - j + 1) / j;

                System.out.printf("%2d", a);
            }
            System.out.println();
        }
        s.close();
    }
}
