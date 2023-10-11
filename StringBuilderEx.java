import java.util.Scanner;
import java.lang.StringBuilder;

public class StringBuilderEx {
    public static void main(String[] args) {
      StringBuilder ans = reverseWordSequence(null);
      System.out.println(ans);
    }
    
    public static StringBuilder reverseWordSequence(String st) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        st=s.nextLine();
        s.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            sb.insert(i,st.charAt(i));
        }
        System.out.println("The entered string is: "+ sb);
        for (int i = sb.length()-1; i >= 0; i--) {
            if (sb.charAt(i)=='.') {
                int index = i;
                sb.insert(sb.charAt(index), sb.charAt(i));
            }
        }
        System.out.println("The reverse word group of string is: ");
return sb;
    }
}
