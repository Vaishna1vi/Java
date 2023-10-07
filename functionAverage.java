import java.util.Scanner;

public class functionAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a, b and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = calculateAverage(a, b, c);
        System.out.println("The average of three number is: " + ans);
        sc.close();
    }

    public static int calculateAverage(int n1, int n2, int n3) {
        int avg = (n1 + n2 + n3) / 3;
        return avg;
    }
}
