import java.util.Scanner;
public class Emirp {
    int n,rev,f;
    static Scanner sc=new Scanner(System.in);
    Emirp(int nn) {
        n=nn;
        rev=0;
        f=2;
    }
    int isprime(int x) {
        int c=0;
        for(int i=1;i<=x;i++) {
            if(x%i==0) {
                c++;
            }
        }
        if(c==2)
            return 1;
        else
            return 0;
    }
    public static void main(String[]args) {
        int t,revNum=0,digit,c2;
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        Emirp ob=new Emirp(num);
        int c=ob.isprime(num);
        if(c==1) {
            t=num;
            while(t!=0) {
                digit=t%10;
                t/=10;
                revNum=revNum*10+digit;
            }
            c2=ob.isprime(revNum);
            if(c2==1)
                System.out.println(num+" is an Emirp Number");
            else
                System.out.println(num+" not an Emirp Number");
        }
        else
            System.out.println("Not Emirp Number");
    }

}