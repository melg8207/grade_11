import java.util.*;
public class EvilNumber {
    public int binary(int num) {
        int count=0;
        while(num>0) {
            if(num%2==1) {
                count++;
            }
            num/=2;
        }
        return count;
    }
    public void evil(int no) {
        int onesCount=binary(no);
        if (onesCount%2==0) {
            System.out.println(no+" is an Evil Number");
        } else {
            System.out.println(no+" is not an Evil Number");
        }
    }
    public static void main(String[]args) {
        EvilNumber obj=new EvilNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x=sc.nextInt();
        System.out.println();
        obj.evil(x);
    }
}
