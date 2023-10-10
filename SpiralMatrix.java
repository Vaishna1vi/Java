import java.util.Scanner;

/**
 * SpiralMatrix
 */
public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row size of array: ");
        int row = s.nextInt();
        System.out.println("Enter column size of array: ");
        int col = s.nextInt();
        System.out.println("Enter elements in matrix or array: ");
        int ar[][] = new int[row][col];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < col; j++) {
                ar[i][j] = s.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        int rowStart = 0;
        int rowEnd = row - 1;
        int colStart = 0;
        int colEnd = col - 1;
        System.out.println("The spiral order of entered matrix is: ");
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (col = colStart; col <= colEnd; col++) {
                System.out.print(ar[rowStart][col] + " ");
            }
            rowStart++;
            for (row = rowStart; row <= rowEnd; row++) {
                System.out.print(ar[row][colEnd] + " ");
            }
            colEnd--;
            for (col = colEnd; col >= colStart; col--) {
                System.out.print(ar[rowEnd][col] + " ");
            }
            rowEnd--;
            for (row = rowEnd; row >= rowStart; row--) {
                System.out.print(ar[row][colStart] + " ");
            }
            colStart++;
            // System.out.println();
        }

    }
}