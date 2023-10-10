import java.util.Scanner;

public class findPrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range to find prime numbers in between: ");
        int start = s.nextInt();
        int end = s.nextInt();
        if (start > end) {
            System.out.println("Please enter the 1st input smaller than 2nd.");
        } else {
            // for(int i=start; i<=end; i++) {

            // }
            System.out.print("The prime numbers in between the range: ");
            // int i = start;
            while (end >= start) {
                int count = 0;
                for (int j = start; j <= end; j++) {
                    if (start % j != 0) {
                        count++;
                    }
                }
                if (count != 0) {
                    System.out.print(start + " ");
                }
                start++;
            }
        }
        s.close();
    }
}
