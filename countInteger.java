import java.util.Scanner;

public class countInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // String c = s.next();
        count(0, 0);
        s.close();
    }

    public static void count(int input, int choice) {
        Scanner sc = new Scanner(System.in);

        int count = 0, pos = 0, neg = 0;
        int i = 0;
        do {
            System.out.println("Enter the integer: ");
            input = sc.nextInt();
            if (input == 0) {
                count++;
            } else if (input < 0) {
                neg++;
            } else {
                pos++;
            }
            System.out.println("Press '1' to continue or '0' to exit.");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Proceed.\n");
            } else if (choice == 0) {
                System.out.println("Exited.\n");
            } else {
                System.out.println("Enter the given numbers only.\nStart again.");
                System.exit(i);
            }
            i++;
        } while (choice != 0);
        sc.close();
        System.out.println("The total number of zero's entered: " + count);
        System.out.println("The total number of positive integer's entered: " + pos);
        System.out.println("The total number of negative integer's entered: " + neg);
        return;
    }
}
