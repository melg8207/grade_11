import java.util.Scanner;
public class Reverse {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int m=sc.nextInt();
        while(m!=0) {
            int rem=m%10;
            m=m/10;
            System.out.print(rem);
        }
    }
}
