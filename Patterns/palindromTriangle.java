import java.util.Scanner;

public class palindromTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1 + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + 2 + " ");
            }

            System.out.println();
        }
        s.close();
    }
}
