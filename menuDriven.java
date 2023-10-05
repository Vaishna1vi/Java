import java.util.Scanner;

public class menuDriven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // USE OF WHILE LOOP

        // System.out.println("Enter the marks: ");
        // int marks = s.nextInt();
        // if (marks >= 90) {
        // System.out.println("This is good.");
        // } else if (89 >= marks && marks >= 60) {
        // System.out.println("This is also good.");
        // } else if (59 >= marks && marks >= 0) {
        // System.out.println("This is also good cuz marks doesn't matter.");
        // }
        // System.out.println("Do you want to continue?\n 0. NO\n 1. YES");
        // int n = s.nextInt();
        // while (n != 0) {
        // System.out.println("Enter the marks: ");
        // marks = s.nextInt();
        // if (marks >= 90) {
        // System.out.println("This is good.");
        // } else if (89 >= marks && marks >= 60) {
        // System.out.println("This is also good.");
        // } else if (59 >= marks && marks >= 0) {
        // System.out.println("This is also good cuz marks doesn't matter.");
        // }
        // System.out.println("Do you want to continue?\n 0. NO\n 1. YES");
        // n = s.nextInt();
        // if(n>1) {
        // System.out.println("Please enter 0 and 1 only.");
        // break;
        // }

        // USE OF DO-WHILE LOOP

        int n;

        do {
            System.out.println("Enter the marks: ");
            int marks = s.nextInt();
            if (100 >= marks && marks >= 90) {
                System.out.println("This is good.");
            } else if (89 >= marks && marks >= 60) {
                System.out.println("This is also good.");
            } else if (59 >= marks && marks >= 0) {
                System.out.println("This is good too because marks doesn't matter.");
            } else {
                System.out.println("Please enter the marks in range of 0 to 100.");
            }
            System.out.println();
            System.out.println("Do you want to continue?\n 0. No\n 1. Yes");
            n = s.nextInt();
            System.out.println();
            // if(n!=0 || n!=1) {
            // System.out.println("Please enter the number given '0' for 'NO' and '1' for
            // 'YES' ");
            // // break;
            // }
            switch (n) {
                case 0:
                    System.out.println("Process terminated...");
                    break;

                case 1:
                    System.out.println("Process Continued.");
                    break;

                default:
                    System.out.println("Please enter the given number of options:\n 0. NO\n 1. YES ");
                    n = s.nextInt();
                    System.out.println();
                    if (n == 0) {
                        System.out.println("Process terminated...");
                    } else if (n == 1) {
                        System.out.println("Process continued.");
                    } else if (n > 1) {
                        System.out.println("Again entered wrong number.\nProcess auto terminated...");
                        System.exit(marks);
                    }
                    break;
            }
            System.out.println();
        } while (n != 0);
        s.close();
    }

}
