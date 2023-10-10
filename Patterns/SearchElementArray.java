import java.util.Scanner;

public class SearchElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of array: ");
        int row = sc.nextInt();
        System.out.println("Enter the column size of array: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be found: ");
        int x = sc.nextInt();
        sc.close();
        System.out.println("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int foundRow = -1, foundCol = -1;
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < col; i++) {
                if (arr[index][i] == x) {
                    foundRow = index;
                    foundCol = i;
                }
            }
        }
        if (foundRow != -1 && foundCol != -1) {
            System.out.println(
                    "Element " + x + " is found at " + "[" + foundRow + ", " + foundCol + "]" + " position in array.");
        } else {
            System.out.println("Entered element " + x + " is not present in array.");
        }
    }
}
