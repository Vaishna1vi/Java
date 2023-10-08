import java.util.Scanner;

public class functionAverage {
    public static void main(String[] args) {
        calculateAverage(0,0);
    }
    
    public static void calculateAverage(int size, int inputs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size to find average: ");
        size = sc.nextInt();
        System.out.println("Enter numbers upto the size to calculate average: ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            inputs = sc.nextInt();
            sum = sum + inputs;
        }
        int rem = sum % size;
        int quiotent = sum / size;
        System.out.println("The average of three number is: " );
        System.out.println(quiotent + "." + rem);
        sc.close();
        return;
    }
}
