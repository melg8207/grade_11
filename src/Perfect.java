import java.util.*;
public class Perfect {
    int num;
    Perfect(int nn) {
        num=nn;
    }
    public int sum_of_factors(int n) {
       int sum=0;
       for(int i=1;i<n;i++) {
           if(n%i==0)
               sum+=i;
       }
       return sum;
    }
    public void check_perfect() {
        if(sum_of_factors(num)==num)
            System.out.println(num+" is a perfect number");
        else
            System.out.println(num+" is not a perfect number");
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        Perfect obj=new Perfect(sc.nextInt());
        obj.check_perfect();
    }
}
