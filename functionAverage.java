import java.util.Scanner;

public class functionAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size to find average: ");
        int n= sc.nextInt();
        System.out.println("Enter numbers upto the size to calculate average: ");
        int a=sc.nextInt();
        for(int i=0; i<n-1; i++) {
            a = sc.nextInt();
        }
        int ans = calculateAverage(a, n);
        System.out.println("The average of three number is: " + ans);
        sc.close();
    }

    public static int calculateAverage(int size, int inputs) {
        // Scanner sc = new Scanner(System.in);
        int sum = inputs;
        // for (int i = 0; i < size; i++) {
        //     inputs = sc.nextInt();
        // }
        for (int i = 0; i < size-1; i++) {
            sum = sum + inputs;
        }
        int avg = sum / size;
        // sc.close();
        return avg;
    }
}
