public class NumLeftTriangle {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int i, j;
        for(i=1; i<n; i++) {
            for(j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}