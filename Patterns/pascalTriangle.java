import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n =s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int p =i+j;
                System.out.print(p + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
