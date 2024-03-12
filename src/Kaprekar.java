import java.util.Scanner;
public class Kaprekar {
    static Scanner sc=new Scanner(System.in);
    int p,q,d,sq;
    public boolean isKaprekar(int n) {
        if(n==1)
           return true;
        // Count the number of digits in square
        sq=n*n;
        d=0;
        while(sq!=0) {
            d++;
            sq/= 10;
        }
        sq=n*n; // Recompute square as it was changed
        // Split the square at different points and see if the sum of split numbers is equal to n.
        for(int r=1;r<d;r++) {
             int eq=(int)Math.pow(10,r);
             // To avoid numbers like 10, 100, 1000 (These are not
             // Kaprekar numbers
             if(eq==n)
                continue;
             // Find the sum of current parts and compare with n
             int sum=sq/eq+sq%eq;
             if(sum==n)
               return true;
        }
        // comparing with the original number
        return false;
    }
    public void process() {
        Kaprekar ob1=new Kaprekar();
        System.out.println("----- Enter range -----");
        System.out.println("Enter first number : ");
        p=sc.nextInt();
        System.out.println("Enter last number  : ");
        q=sc.nextInt();
        System.out.println();
        System.out.println();
        for(int i=p;i<=q;i++) {
            if(ob1.isKaprekar(i))
                System.out.print(i+" ");
        }
    }
    // Driver method
    public static void main (String[] args) {
        Kaprekar obj=new Kaprekar();
        obj.process();
    }
}
