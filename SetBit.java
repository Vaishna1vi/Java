import java.util.Scanner;

/**
 * SetBit
 */
public class SetBit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        System.out.println("Enter the position where you want to set the bit: ");
        int pos = s.nextInt();
        int bitMask = 1 << pos;
        int newNumber = bitMask | n;
        System.out.println("The new number after set the bit on the given position will be: " + newNumber);
        s.close();
    }
}