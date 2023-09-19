import java.util.Scanner;

public class EquiTriangle {
    public static void main(String[] args) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // for (j = 0; j <= 2 * (n + i); j++) {
            //     // if( j>i-1) {
            //     if (j < i) {
            //         // System.out.print(" ");
            //         System.out.print("* ");

            //     } else {
            //         // System.out.print("* ");
            //         System.out.print(" ");

            //     }
            // }
            for(j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        s.close();
    }
}
