import java.util.*;
public class MatrixFill {
    public char read(Scanner sc,String prompt) {
        System.out.print(prompt);
        return sc.next().charAt(0);
    }
    public void fillMatrix(int n,char[][] A,char c1,char c2,char c3) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if(i==j||(i+j)==(n-1))
                    A[i][j]=c3;
                else
                    A[i][j]=c2;
            }
        }
        for(int i=0;i<n/2;i++) {
            for (int j=i+1;j<n-1-i;j++) {
                A[i][j]=c1;
                A[n-1-i][j]=c1;
            }
        }
    }
    public void printMatrix(char[][] A,int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args) {
        MatrixFill obj=new MatrixFill();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the matrix : ");
        int n=sc.nextInt();
        if(n<2||n>10) {
            System.out.println("Size out of range!");
        }
        else {
            char[][] A=new char[n][n];
            char c1,c2,c3;
            c1=obj.read(sc,"Enter first character  : ");
            c2=obj.read(sc,"Enter second character : ");
            c3=obj.read(sc,"Enter third character  : ");
            obj.fillMatrix(n,A,c1,c2,c3);
            obj.printMatrix(A,n);
        }
    }
}
