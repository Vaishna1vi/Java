//  Program to print the total sum of entered n numbers using recursion.

import java.util.Scanner;

public class RecursionSum {
    public static void totalSum(int i, int sum, int n) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        totalSum(++i, sum, n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = 1;
        int sum = 0;
        System.out.println("Enter the value of Nth term: ");
        int n = s.nextInt();
        System.out.println("The sum upto Nth term is: ");
        totalSum(start, sum, n);
        s.close();
    }
}
