import java.util.Scanner;
public class MAT {
    static Scanner sc=new Scanner(System.in);
    int[] A=new int[5];
    int[] B=new int[5];
    MAT() {
        for(int i=0;i<5;i++) {
           A[i]=0;
           B[i]=0;
        }
    }
    void accept() {
        System.out.println("Enter any 5 integers into first array : ");
        for (int i=0;i<5;i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter any 5 integers into second array : ");
        for (int i=0;i<5;i++) {
            B[i] = sc.nextInt();
        }
    }
    static MAT sum(MAT X, MAT Y) {
        MAT C=new MAT();
        for(int i=0;i<5;i++) {
            C.A[i]=X.A[i]+Y.B[i];
        }
        return C;
    }
    public static void main(String[]args) {
        MAT ob=new MAT();
        MAT ob1=new MAT();
        ob.accept();
        ob1.accept();
        MAT result=sum(ob,ob1);
        System.out.println();
        System.out.println();
        System.out.print("Sum of Arrays : ");
        for(int i=0;i<5;i++) {
            System.out.print(result.A[i]);
        }
    }
}
