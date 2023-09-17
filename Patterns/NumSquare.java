public class NumSquare {
    public static void main(String[] args) {
        int i, j;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(i=1; i<=n; i++) {
for(j=1; j<=n; j++) {
    // if(i==1||j==n||j==1||i==n){
    //     System.out.print(" 2 ");
    // }
    // else {
    //     System.out.print("   ");
    // }

    if(i==1|| i==n) {
        System.out.print(i+ " ");
    }
    else if(j==1|| j==n) {
        System.out.print(i+ " ");
    }
    else {
        System.out.print("  ");
    }
}
System.out.println(' ');
        }
        sc.close();
    }
}
