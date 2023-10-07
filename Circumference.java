import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        double r = sc.nextDouble();
        System.out.println("The circumference of circle is: " + circumference(r));
        sc.close();
    }

    public static double circumference(double radius) {
        double circum = 2 * 3.14 * radius;
        return circum;
    }
}
