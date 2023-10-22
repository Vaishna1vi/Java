import java.util.Scanner;

/**
 * GetBit
 */
public class GetBit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        System.out.println("Enter the position where you want to check the bit: ");
        int pos = s.nextInt();
        int bitMask = 1 << pos;
        System.out.println("The entered number is: " + n);
        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero.");
        } else {
            System.out.println("Bit was one.");
        }
        s.close();
    }
}