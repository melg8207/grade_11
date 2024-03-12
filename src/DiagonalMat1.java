/** Program to display the numbers which are below the left diagonal */
import java.util.Scanner;
public class DiagonalMat1 {
    // Method for matrix input
    private void in_Matrix(int[][] matrix,Scanner sc) {
        System.out.println("Enter the elements of the matrix (5x5) : ");
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
    }
    // Method for matrix display
    private void dispMatrix(int[][] matrix) {
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    // Method for displaying numbers below left diagonal
    private void belowleftdiag(int[][] matrix) {
        for(int i=1;i<5;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DiagonalMat1 obj=new DiagonalMat1();
        Scanner scr=new Scanner(System.in);
        // Input matrix
        int[][] matrix=new int[5][5];
        obj.in_Matrix(matrix,scr);
        // Display matrix
        System.out.println("\nMatrix:");
        obj.dispMatrix(matrix);
        // Display numbers below left diagonal
        System.out.println("\nNumbers below left diagonal:");
        obj.belowleftdiag(matrix);
    }

}