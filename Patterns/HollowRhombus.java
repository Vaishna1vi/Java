import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(i=0; i<n; i++) {
            for(j=0; j<2*(n-i); j++) {
                System.out.print(" ");
            }
            for(j=0; j<=i; j++) {
                if(j==0){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for(j=0; j<i; j++) {
                if(j==i-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for(i=n; i>0; i--) {
            if(i!=n) {
                for(j=0; j<=2*(n-i); j++) {
                    System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                if(j==1){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            for(j=1; j<i; j++) {
                if(j==i-1) {
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        }
    }
}
