import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Define the dimensions of the matrix
        int rows=3;
        int cols=4;
        // Create the matrix
        int[][] matrix=new int[rows][cols];
        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix (3x4):");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                matrix[i][j]=input.nextInt();
            }
        }
        // Find and print the transpose of the matrix
        int[][] transpose=new int[cols][rows];
        for (int i=0;i<cols;i++) {
            for (int j=0;j<rows;j++) {
                transpose[i][j]=matrix[j][i];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        System.out.println("Transpose Matrix:");
        printMatrix(transpose);
        input.close();
    }
    // Utility method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row:matrix) {
            for (int elem:row) {
                System.out.print(elem+"\t");
            }
            System.out.println();
        }
    }
}
