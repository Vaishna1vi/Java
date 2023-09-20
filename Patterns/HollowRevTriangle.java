public class HollowRevTriangle {
    public static void main(String[] args) {
        int i, j;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (i = n; i > 0; i--) {
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (j = 1; j < i; j++) {
                if (i == n || j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
