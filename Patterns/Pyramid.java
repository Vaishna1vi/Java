public class Pyramid {

public static void printStars(int n) {
int i,j;
for(i=0;i<n;i++){
for(j=0;j<=i;j++) {
System.out.print("* ");
}
System.out.println();
}
}
public static void main(String args[]) {
int n=5;
printStars(n);
}  
}

// public static void main(String args[]) {
//     System.out.println("Enter the value of n: ");
// java.util.Scanner sc=new java.util.Scanner(System.in);
// int n=sc.nextInt();
// sc.close();
// System.out.println("Star pattern upto the value of n:- ");
// for(int i=0;i<n;i++){
// for(int j=0;j<=i;j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }