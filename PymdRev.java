public class PymdRev {
    public static void main(String[] args) {
        for(int i=5;i>=0;i--) {
            // for(int i=0; i<5; i++) {
            for(int j=0;j<i; j++) {
                // for(int j=i; j>=0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
