import java.util.Scanner;

/**
 * replaceString
 */
public class replaceString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.next();
        String result = "";
        System.out.println("Original string is: " + str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result = result + 'i';
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println("Result string is: " + result);
        s.close();
    }
}