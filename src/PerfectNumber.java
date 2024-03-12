import java.util.Scanner;
public class PerfectNumber {
    public boolean isPerfect(int num) {
        if(num<=0) {
            return false;
        }
        int sum=0;
        for(int i=1;i<=num/2;i++) {
            if(num%i==0) {
                sum+=i;
            }
        }
        return sum==num;
    }
    public static void main(String[]args) {
        PerfectNumber obj=new PerfectNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x= sc.nextInt();
        if(obj.isPerfect(x)) {
            System.out.println(x+" is a Perfect Number");
        }
        else {
            System.out.println(x+" is not a Perfect Number");
        }
    }
}