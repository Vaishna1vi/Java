import java.util.Scanner;

public class invertedNumPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int num = 1;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num++;
        }
        s.close();
    }
}
