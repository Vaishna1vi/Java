public class HollowRightTriangle {
    public static void main(String[] args) {
        int i, j;
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        s.close();
    }
}
