public class PymdRev {
    public static void main(String[] args) {
        // int n = 5;
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        // for(int i=5;i>=0;i--) {
        for (int i = 0; i < n; i++) {
            // for(int j=0;j<i; j++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}
