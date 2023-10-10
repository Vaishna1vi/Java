import java.util.Scanner;

public class EmailToUsernameString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the email Id: ");
        String email = s.next();
        String username = "";
        System.out.println("Email Id is: " + email);
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) != '@') {
                username = username + email.charAt(i);
            } else {
                break;
            }
        }
        System.out.println("UserName is: " + username);
        s.close();
    }
}
