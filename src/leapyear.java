import java.util.Scanner;
public class leapyear {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year: ");
        long year=sc.nextLong();
        boolean leapyear=findleapyr(year);
        if(leapyear) {
            System.out.println("The year entered is a leap year");
        }
        else {
            System.out.println("The year entered is not a leap year");
        }
    }
    public static boolean findleapyr(long year) {
        if(year%4==0) {
            if (year%100==0) {
                return year%400==0;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}
