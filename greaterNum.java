import java.util.Scanner;

public class greaterNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = biggerNum(a, b);
        System.out.println("The greater number between given number is: " + ans);
        sc.close();
    }

    public static int biggerNum(int n1, int n2) {
        int bigger;
        if (n1 < n2) {
            bigger = n2;
        } else {
            bigger = n1;
        }
        return bigger;
    }
}
