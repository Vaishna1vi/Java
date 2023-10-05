import java.util.Scanner;

public class findPrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range to find prime numbers in between: ");
        int start = s.nextInt();
        int end = s.nextInt();
        if(start>end) {
            System.out.println("Please enter the 1st input smaller than 2nd.");
        } else {
            
        }
        s.close();
    }
}
