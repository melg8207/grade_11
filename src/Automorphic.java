import java.util.*;
public class Automorphic {
    static Scanner sc=new Scanner(System.in);
    int m,mcopy,c,d;
    public void input() {
        System.out.print("Enter an integer : ");
        m=sc.nextInt();
        mcopy=m; //copy of integer
        c=0;d=0; //c> to count no of digits & d> digit
    }
    static boolean isAutomorphic(int num) {
        //determines the square of the specified number
        int square=num*num;
        //comparing the digits until the number becomes 0
        while(num>0) {
            //find the remainder (last digit) of the variable num and square and comparing them
            if(num%10!=square%10)
                return false;   //returns false if digits are not equal
            num=num/10;       //reduce num and square by dividing them by 10
            square=square/10;
        }
        return true;
    }
    public void calculate() {
        //to check if m is automorphic
        if(isAutomorphic(m)) {
            System.out.println(m+" is an Automorphic number");
        }else {
            System.out.println(m+" is not an Automorphic number");
        }
    }
    public static void main(String[]args) {
        Automorphic ob=new Automorphic();
        ob.input();
        ob.calculate();
    }
}
