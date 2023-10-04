// PROBLEM STATEMENT- Enter any 5 digit number and find the sum of square of all five digits

import java.util.Scanner;

public class sumSquareNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String str = sc.nextLine();
        int num = Integer.valueOf(str);
        sc.close();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum = sum + ((num % 10) * (num % 10));
            num = num / 10;
        }

        if (str.length() <= 5) {
            System.out.println("The sum of square of each digit of a number is: " + sum);
        } else {
            System.out.println("Please enter the less or equal to five digit number.");
        }
    }
}
