import java.util.Scanner;
public class Magic {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        sc.close();
        if(isMagic(num)) {
            System.out.println(num+" is a magic number.");
        }else {
            System.out.println(num+" is not a magic number.");
        }
    }
    public static boolean isMagic(int num) {
        int sum;
        while(num>9) {
            sum=0;
            while(num>0) {
                sum+=num%10;
                num/=10;
            }
            num=sum;
        }
        return num==1;
    }
}