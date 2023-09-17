public class HollowLeftTriangle {
    public static void main(String[] args) {
        int i, j;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        // for(i=1; i<=n; i++) {
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (i == n || j == 1 || j == i) {
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
