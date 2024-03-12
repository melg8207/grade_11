import java.util.Scanner;
public class Factorial {
    static int num1,num2;
    static double S;
    public int fact(int n) {
        if(n==0||n==1) {
            return 1;
        }
        int result=1;
        for(int i=1;i<=n;i++) {
            result*=i;
        }
        return result;
    }
    public static void input() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1=sc.nextInt();
        System.out.println("Enter second number : ");
        num2= sc.nextInt();
    }
    public static void calculate() {
        Factorial ob1=new Factorial();
        S=(double)ob1.fact(num1)/(ob1.fact(num2)*ob1.fact(num1-num2));
    }
    public static void main(String[]args) {
        input();
        calculate();
        System.out.println("S = "+S);

    }
}
