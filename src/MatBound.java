import java.util.*;
public class MatBound {
    static Scanner sc=new Scanner(System.in);
    int[][] Mat;
    int size;
    MatBound(int n) {
        size=n;
        Mat=new int[size][size];
    }
    public void accept() {
        for(int r=0;r<size;r++) {
            for(int c=0;c<size;c++) {
                System.out.print("Enter element at "+r+" "+c+" : ");
                Mat[r][c]=sc.nextInt();
            }
        }
    }
    public void findsum(int[][] mat) {
        int sum=0;
        int r=mat.length;
        int c=mat[0].length;
        for(int j=0;j<c;j++) {
            sum+=mat[0][j];
        }
        for(int j=0;j<c;j++) {
            sum+=mat[r-1][j];
        }
        for(int i=1;i<r-1;i++) {
            sum+=mat[i][0];
        }
        if(c>1) {
            for(int i=1;i<r-1;i++) {
                sum+=mat[i][c-1];
            }
        }
        System.out.println("Sum of all boundary elements is : "+sum);
    }
    public void display() {
        for(int r=0;r<size;r++) {
            for(int c=0;c<size;c++) {
                System.out.print(Mat[r][c]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args) {
        System.out.println("Enter size of matrix : ");
        int size=sc.nextInt();
        MatBound obj=new MatBound(size);
        obj.accept();
        obj.findsum(obj.Mat);
        obj.display();
    }
}
