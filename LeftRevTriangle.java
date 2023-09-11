import java.util.Scanner;

public class LeftRevTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        sc.close();
    }
}
