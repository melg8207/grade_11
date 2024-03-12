import java.util.*;
public class Fibonacci {
    int fibo(int n) {          //n=nth term
        if(n==1)
            return 2;          //as 2 is the first term in the series
        else if(n==2)
            return 3;          //as 3 is the second term in the series
        else
            return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int t;
        Fibonacci obj=new Fibonacci();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        t=sc.nextInt();
        System.out.println("Fibonacci series upto "+t+": ");
        for(int i=1;i<=t;i++) {
            System.out.print(obj.fibo(i)+" ");
        }
    }
}