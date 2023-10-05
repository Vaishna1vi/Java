import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers to perform the operation.");
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(
                "Enter the number of operation type:\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Remainder");
        int input = s.nextInt();

        switch (input) {
            case 1:
                int add = a + b;
                System.out.println("Addition of two number is: " + add);
                break;

            case 2:
                int sub = b - a;
                System.out.println("Subtraction of two number is: " + sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println("Multiplication of two number is: " + mul);
                break;
            case 4:
                int div = b / a;
                System.out.println("Division of two number is: " + div);
                break;
            case 5:
                int rem = b % a;
                System.out.println("Remainder of two number is: " + rem);
                break;

            default:
                System.out.println("Invalid option chosen.");
                break;
        }
        s.close();
    }
}