import java.util.Scanner;

public class numberTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the positive number: ");
        int n = s.nextInt();
        if(n<=0) {
            System.out.println("Please enter the positive numbers only and greater than 0.");
        }
        else {
            System.out.println("The multiplication table of entered number upto 20 is as follows: ");
            for (int i = 1; i <= 20; i++) {
               int m = n*i;
               System.out.println(m);

            }
        }
        s.close();
    }
}
