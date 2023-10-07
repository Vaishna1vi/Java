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
            int i = start;
            while (end >= i) {
                int count = 0;
                for (int j = 1; j <= end; j++) {
                    if (i % j != 0) {
                        count++;
                    }
                }
                if (count != 1) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
        s.close();
    }
}
