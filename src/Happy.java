import java.util.Scanner;
public class Happy {
    private int n; // stores the number
    // Constructor to assign 0 to n
    public Happy() {
        n=0;
    }
    // Function to assign the parameter value to the number
    public void getnum(int nn) {
        n=nn;
    }
    // Function to calculate the sum of the square of digits of the number
    public int sum_sq_digits(int x) {
        int sum=0;
        while(x>0) {
            int digit=x%10;
            sum+=(digit*digit);
            x/=10;
        }
        return sum;
    }
    // Function to check if the given number is a happy number
    public void isHappy() {
        int slow=n;
        int fast=n;
        do {
            slow=sum_sq_digits(slow);
            fast=sum_sq_digits(sum_sq_digits(fast));
        } while(slow!=fast);
        if(slow==1) {
            System.out.println(n+" is a happy number.");
        }else {
            System.out.println(n+" is not a happy number.");
        }
    }
    public static void main(String[]args) {
        Happy obj=new Happy();
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scr.nextInt();
        obj.getnum(num);
        obj.isHappy();
        scr.close();
    }
}

