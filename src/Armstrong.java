import java.util.Scanner;
public class Armstrong {
    static Scanner sc=new Scanner(System.in);
    int m,mcopy;
    public void input() {
        System.out.println("Enter an integer : ");
        m=sc.nextInt();
        mcopy=m;
    }
    public void calculate() {
        int sum=0;
        int n=m;
        int numOfDigits=(int)Math.log10(m)+1;
        while (n>0) {
            int rem=n%10;
            sum+= (int) Math.pow(rem,numOfDigits);
            n/=10;
        }
        if (sum==mcopy) {
            System.out.println(mcopy+" is an Armstrong number.");
        } else {
            System.out.println(mcopy+" is not an Armstrong number.");
        }
    }
    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        armstrong.input();
        armstrong.calculate();
    }
}