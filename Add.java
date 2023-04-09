import java.util.*;

public class Add {
public static void main(String args[]) {
System.out.println("Enter the value of a and b: ");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
//int a,b;
int c=a+b;
System.out.println("Result ="+c);
sc.close();
}
}