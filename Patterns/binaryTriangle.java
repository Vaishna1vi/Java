import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = s.nextInt();
        pattern(input);
        s.close();
    }

    public static void pattern(int n) {
        int x = 0, y = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(y + " ");
                } else {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}
