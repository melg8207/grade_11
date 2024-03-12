/**
 * Java program to shuffle an inputted matrix
 * class Shift{} to make the first row become last; second row becomes first and so on
 * cyclic() method to shuffle a 2D Array of order (m x n)
 */
import java.util.*;
public class Shift {
    private final int[][] mat;
    private final int m;
    private final int n;
    public Shift(int mm,int nn) {
        m=mm;
        n=nn;
        mat=new int[m][n];
    }
    public void input() {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                mat[i][j]=sc.nextInt();
            }
        }
    }
    public void cyclic() {
        int[] temp=mat[0];
        for(int i=0;i<m-1;i++) {
            mat[i]=mat[i+1];
        }
        mat[m-1]=temp;
    }
    public void display() {
        System.out.println();
        System.out.println("Matrix after shifting : ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows (m)    : ");
        int m=sc.nextInt();
        System.out.print("Enter the number of columns (n) : ");
        int n=sc.nextInt();
        Shift shift=new Shift(m,n);
        shift.input();
        shift.cyclic();
        shift.display();
    }
}