import java.util.Scanner;
public class Series4 {
    static Scanner sc=new Scanner(System.in);
    public void series(int x) {
         for(int i=0;i<x;i++) {
            int denominator=3+2*i;
            System.out.print("1/"+denominator);

            if(i<x-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[]args) {
        Series4 obj=new Series4();
        System.out.println("Enter number of terms : ");
        int n=sc.nextInt();
        obj.series(n);
    }
}
