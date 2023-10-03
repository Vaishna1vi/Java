// PROBLEM STATEMENT- Enter any 5 digit number and find the sum of square of all five digits

import java.util.Scanner;

public class sumSquareNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int i = 0, n, sum = 0, m;
        for (i = 0; i < 5; i++) {
            n = num % 10;
            m = num / 10;
            sum = n  + sum;
        }
        System.out.println(sum);
        if (i < 5) {
        } else {
            System.out.println("Please enter the less or equal to five digit number. ");
        }
        sc.close();
    }
}
