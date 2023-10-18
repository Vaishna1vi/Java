import java.util.Scanner;

/**
 * GetBit                                                                                                        
 */
public class GetBit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        byte n = s.nextByte();
        System.out.println(n);
        s.close();
    }
}