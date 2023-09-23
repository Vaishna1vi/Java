public class NumSquare {
    public static void main(String[] args) {
        int i, j;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (n >= 0 && n <= 9) {
            if (n == 0 || n == 1) {
                System.out.println("Sorry.. Number square can't be made for 0 and 1.");
            }
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    // if(i==1||j==n||j==1||i==n){
                    // System.out.print(" 2 ");
                    // }
                    // else {
                    // System.out.print(" ");
                    // }

                    if (i == 1 || i == n) {
                        System.out.print(i + " ");
                    } else if (j == 1 || j == n) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println(' ');
            }

        } else {
            System.out.println("Please enter the number in range of 2 to 9.");
        }
        sc.close();
    }
}
