import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        floydTriangle ft = new floydTriangle();
        ft.floyd(num);
        s.close();
    }

    public void floyd(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(number + " ");
                    number++;
            }
            System.out.println();
        }
    }
}
