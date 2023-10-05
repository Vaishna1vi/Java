import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Not prime.");
        } else {
            System.out.println("Prime.");
        }
        s.close();
    }
}
