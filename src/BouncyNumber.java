import java.util.*;
// This program checks if a given number is increasing by comparing each digit with the next digit in its string representation.
public class BouncyNumber {
    public boolean isIncreasing(int n) {
        String s=Integer.toString(n);
        char ch;
        int f=0;
        for(int i=0;i<s.length()-1;i++) {
            ch=s.charAt(i);
            if(ch>s.charAt(i+1)) {
                f=1;
                break;
            }
        }
        return f!=1;
    }
    public boolean isDecreasing(int n) {
        String s2=Integer.toString(n);
        char ch2;
        int f2=0;
        for(int i=0;i< s2.length()-1;i++) {
            ch2=s2.charAt(i);
            if(ch2<s2.charAt(i+1)) {
                f2=1;
                break;
            }
        }
        return f2!=1;
    }
    public void isBouncy(int n) {
        BouncyNumber ob1=new BouncyNumber();
        if(ob1.isIncreasing(n))
            System.out.println(n+" is not a Bouncy Number");
        else if(ob1.isDecreasing(n))
            System.out.println(n+" is not a Bouncy Number");
        else
            System.out.println(n+" is a Bouncy Number");
    }

    public static void main(String[]args) {
        BouncyNumber obj=new BouncyNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x=sc.nextInt();
        System.out.println();
        obj.isBouncy(x);
    }
}
