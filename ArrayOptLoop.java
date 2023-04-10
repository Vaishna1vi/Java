import java.util.*;

public class ArrayOptLoop {
    public static void main(String[] args) {
        // int n=a.length;
        // a[0]=2;
        // a[1]=3;
        // a[2]=4;
        // a[3]=5;
        Scanner sc = new Scanner(System.in);
        // int n;
        int n=sc.nextInt();
        int[] a = new int[n];
for(int i=0; i<n;i++) {
  a[i]= sc.nextInt();
}
sc.close();
for(int x:a){
    System.out.println(x);
}
    }
}
