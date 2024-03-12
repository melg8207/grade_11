import java.util.Scanner;
public class MatrixColumnMax {
    static Scanner input=new Scanner(System.in);
    int[][] matrix=new int[4][4];
    public void input() {
        System.out.println("Enter values for the 4x4 matrix:");
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                matrix[i][j]=input.nextInt();
            }
        }
    }
    public void calculate() {
        System.out.println();
        System.out.println();
         for(int j=0;j<4;j++) {
            int max=matrix[0][j];
            for(int i=1;i<4;i++) {
                if(matrix[i][j]>max) {
                    max=matrix[i][j];
                }
            }
            System.out.println("The highest value of column "+(j+1)+"= "+max);
        }
    }
    public static void main(String[]args) {
        MatrixColumnMax obj=new MatrixColumnMax();
        obj.input();
        obj.calculate();
    }
}
