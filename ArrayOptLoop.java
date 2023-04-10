import java.util.*;

public class ArrayOptLoop {
    public static void main(String[] args) {
        // int n=a.length;
        // a[0]=2;
        // a[1]=3;
        // a[2]=4;
        // a[3]=5;
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        // int n;
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
for(int i=0; i<n;i++) {
  a[i]= sc.nextInt();
}
sc.close();
System.out.println("The elements present in the array are: ");
  for(int x:a){
      System.out.print(x+"\t");
    }
    }
}
