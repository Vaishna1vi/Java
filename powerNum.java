import java.util.Scanner;

public class powerNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = s.nextInt();
        System.out.println("Enter the base number: ");
        int power = s.nextInt();
        s.close();
        System.out.println("The answer: " + powerOfNum(base, power));
    }

    public static int powerOfNum(int b, int p) {
        int ans = 1;
        if (p == 0) {
            ans = 1;
        } else {
            for (int i = 0; i < p; i++) {
                ans = ans * b;
                // ans = b^p;
            }
        }
        return ans;
    }
}
