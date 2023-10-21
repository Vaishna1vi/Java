import java.util.Scanner;

/**
 * LadderIfElse
 */
public class LadderIfElse {

    static void isDivisibleByPrime (int n) 
    {
            //Your code here
           if((n%2==0&&n%3==0&&n%11==0)||(n%3==0&&n%11==0)||n%11==0) {
               System.out.println("Eleven");
           } else if((n%3==0&&n%2==0)||(n%3==0)) {
               System.out.println("Three");
           } else if(n%2==0) {
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