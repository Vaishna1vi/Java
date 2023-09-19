import java.util.Scanner;

public class HollowEquiTriangle {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(i=0; i<n; i++) {
            for(j=0; j<2 * (n-i); j++) {
                System.out.print(" ");
            }
            for(j=0; j<=i; j++) {
                if(j==0||i==n-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for(j=0; j<i; j++) {
                if(j == i-1|| i==n-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
