import java.util.Scanner;

/**
 * DecimalToBinary
 * It convert the decimal numbers into binary numbers.
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        if (n < 0) {
            System.out.println("Please enter the number greater than 0.");
        } else {
            System.out.println("Binary number of the given number is: " + sb.reverse());
        }
        s.close();
    }
}
