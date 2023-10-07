import java.util.Scanner;

public class oddNumSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the max number: ");
        int max = s.nextInt();
        System.out.println("The sum of all odd numbers upto entered value is: " + calculateOddNumbersSum(max));
        s.close();
    }

    public static int calculateOddNumbersSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
