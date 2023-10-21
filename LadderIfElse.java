import java.util.Scanner;

/**
 * LadderIfElse:-
 * 
 * Sometimes, the normal if-else isn't enough. In such cases, we
 * have what we call ladder if * and else conditions. So here we'll learn to use
 * them.
 * 
 * PROBLEM OF GFG:-
 * 
 * Given a positive integer N. Your task is to check if it
 * divisible as given below:
 * 1. If it is divisible by 2, print "Two".
 * 2. If it is divisible by 3, print "Three".
 * 3. If it is divisible by 11, print "Eleven".
 * 4. If not follow above three rules, print "-1".
 * 
 * Note: If N is divisible by more than one of the above given numbers, print
 * the one which * is largest.
 * 
 * EXAMPLE: -
 * 
 * 1. Input- 66 Output- Eleven
 * 2. Input- 6 Output- Three
 * 
 */

public class LadderIfElse {

    static void isDivisibleByPrime(int n) {
        if ((n % 2 == 0 && n % 3 == 0 && n % 11 == 0) || (n % 3 == 0 && n % 11 == 0) || n % 11 == 0) {
            System.out.println("Eleven");
        } else if ((n % 3 == 0 && n % 2 == 0) || (n % 3 == 0)) {
            System.out.println("Three");
        } else if (n % 2 == 0) {
            System.out.println("Two");
        } else {
            System.out.println("-1");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        s.close();
        isDivisibleByPrime(n);
    }
}