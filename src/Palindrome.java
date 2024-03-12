import java.util.Scanner;
public class Palindrome {
    static Scanner sc=new Scanner(System.in);
    int m,mcopy;
    public void input() {
        System.out.print("Enter an integer : ");
        m=sc.nextInt();
        mcopy=m;
    }
    public void calculate() {
        int no=0;
        while(m!=0) {
            int rem=m%10;
            no=no*10+rem;
            m=m/10;
        }
        if(no==mcopy) {
            System.out.println(mcopy+" is a Palindrome number");
        }
        else {
            System.out.println(mcopy+" is not a Palindrome number");
        }
    }
    public static void main(String[]args) {
        Palindrome obj=new Palindrome();
        obj.input();
        obj.calculate();
    }
}
