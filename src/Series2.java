import java.util.Scanner;
public class Series2 {
    static Scanner sc=new Scanner(System.in);
    public static void series(int n) {
        int val;
        for(int i=1;i<=n;i++) {
            val=(int)(Math.pow(i,3)-1);
            System.out.print(val);
            if(i!=n) {
                System.out.print(", ");
            }
        }
    }
    public static void main(String[]args) {
        System.out.println("Enter the number of terms in series : ");
        int n= sc.nextInt();
        series(n);
    }
}
