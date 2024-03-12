import java.util.Scanner;
public class LeftDiagonal {
    public void input(int[][] matrix, Scanner sc) {
        System.out.println("Enter elements of the matrix (5 x 5) : ");
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
    }
    public void display(int[][] matrix) {
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public void left_diag(int[][] matrix) {
        for(int i=0;i<5;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        int[][] matrix=new int[5][5];
        Scanner sc=new Scanner(System.in);
        LeftDiagonal obj=new LeftDiagonal();
        obj.input(matrix,sc);
        System.out.print("\nMatrix : \n");
        obj.display(matrix);
        System.out.println();
        System.out.println("Numbers below left diagonal : ");
        obj.left_diag(matrix);
    }
}
