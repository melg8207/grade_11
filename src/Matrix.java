import java.util.Scanner;
public class Matrix {
    static Scanner sc=new Scanner(System.in);
    int[][] arr =new int[25][25];
    int m,n;
    Matrix(int mm,int nn) {
        m=mm;
        n=nn;
    }
    void fill_array() {
        System.out.print("\n Enter elements of matrix A and B: \n");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    Matrix SubMat(Matrix A) {
        Matrix B=new Matrix(m,n);
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++)
                B.arr[i][j]=arr[i][j]-A.arr[i][j];
        }
        return B;
    }
    void display() {
        System.out.println();
        System.out.print("Matrix A - Matrix B = ");
        for(int i=0;i<m;i++) {
            System.out.print("\n");
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+"\t");
        }
    }
    public static void main(String[]args) {
        System.out.println("\n Size of the Matrix : \n");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Matrix A=new Matrix(x,y);
        Matrix B=new Matrix(x,y);
        new Matrix(x,y);
        Matrix C;
        A.fill_array();
        B.fill_array();
        C=A.SubMat(B);
        C.display();
    }

}
