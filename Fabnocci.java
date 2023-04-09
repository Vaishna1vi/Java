public class Fabnocci {
public static void main(String args[]) {
System.out.println("Enter the value of n: ");
java.util.Scanner sc= new java.util.Scanner(System.in);
int n=sc.nextInt();
sc.close();
System.out.println("The Fabnocci Series upto the value of n is: ");
int n1=0;
int n2=1;
System.out.println(n1);
System.out.println(n2);
for(int i=0; i<=n; i++) {
int n3=n1+n2;
n1=n2;
n2=n3;
System.out.println(n3);
}
}
}