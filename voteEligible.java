import java.util.Scanner;

public class voteEligible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = s.nextInt();
        checkEligibleAge(age);
        s.close();
    }

    public static void checkEligibleAge(int a) {
        if (a < 0) {
            System.out.println("Please enter correct age in positive value.");
        } else if (a <= 17) {
            System.out.println("Your are not eligible to vote. Please wait to be grown up.");
        } else {
            System.out.println("Your are eligible to vote.");
        }
        return;
    }
}
