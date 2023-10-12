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
            int p=1;
            for (int j = 0; j <= i; j++) {
                 p =(p*(n-i)/i+1);
                System.out.print(p + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
