import java.util.Scanner;

public class TransposeArray {
    public static void main(String[] args) {
transpose();
    }

    public static void transpose() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row size of array: ");
        int row = s.nextInt();
        System.out.println("Enter column size of array: ");
        int col = s.nextInt();
        System.out.println("Enter elements in array: ");
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        s.close();
        System.out.println("The matrix is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the matrix is: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
