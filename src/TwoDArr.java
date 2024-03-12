import java.util.Scanner;
public class TwoDArr {
    static Scanner sc=new Scanner(System.in);
    int[][] A=new int[2][2];
    int[][] B=new int[2][2];
    public void input() {
        System.out.println("Enter 4 numbers in matrix A : ");
        for(int r=0;r<2;r++) {
            for(int c=0;c<2;c++) {
                A[r][c]=sc.nextInt();
            }
        }
        System.out.println("Enter 4 numbers in matrix B : ");
        for(int r=0;r<2;r++) {
            for(int c=0;c<2;c++) {
                B[r][c]=sc.nextInt();
            }
        }
    }
    public void matrixAandB() {
        System.out.println();
        System.out.println();
        System.out.println("Matrix A : ");
        for(int r=0;r<2;r++) {
            for(int c=0;c<2;c++) {
                System.out.print(A[r][c]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix B : ");
        for(int r=0;r<2;r++) {
            for(int c=0;c<2;c++) {
                System.out.print(B[r][c]+"\t");
            }
            System.out.println();
        }
    }
    public void matrixAplusB() {
        int[][] C=new int[2][2];
        System.out.println();
        System.out.println();
        System.out.println("Matrix A + B : ");
        for(int r=0;r<2;r++) {
            for(int c=0;c<2;c++) {
                C[r][c]=A[r][c]+B[r][c];
                System.out.print(C[r][c]+"\t");
            }
            System.out.println();
        }
    }
    public void matrixAsubB() {
        int[][] D=new int[2][2];
        System.out.println();
        System.out.println();
        System.out.println("Matrix A - B : ");
        for(int r=0;r<2;r++) {
            for(int c=0;c<2;c++) {
                D[r][c]=A[r][c]-B[r][c];
                System.out.print(D[r][c]+"\t");
            }
            System.out.println();
        }
    }
    public void principaldiag() {
        System.out.println();
        System.out.println();
        System.out.println("Principal Diagonal of Matrix A : ");
        for(int r=0;r<2;r++) {
            for(int c=0;c<2;c++) {
                if(r==c) {
                    System.out.print(A[r][c]+"\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Principal Diagonal of Matrix B : ");
        for(int r=0;r<2;r++) {
            for(int c=0;c<2;c++) {
                if(r==c) {
                    System.out.print(B[r][c]+"\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public void otherdiag() {
        System.out.println();
        System.out.println();
        System.out.println("Other Diagonal of Matrix A : ");
        for(int r=0;r<2;r++) {
            for(int c=0;c<2;c++) {
                if(r!=c) {
                    System.out.print(A[r][c]+"\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Other Diagonal of Matrix B : ");
        for(int r=0;r<2;r++) {
            for(int c=0;c<2;c++) {
                if(r!=c) {
                    System.out.print(B[r][c]+"\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        TwoDArr obj=new TwoDArr();
        obj.input();
        obj.matrixAandB();
        obj.matrixAplusB();
        obj.matrixAsubB();
        obj.principaldiag();
        obj.otherdiag();
    }
}
