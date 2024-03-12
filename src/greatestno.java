import java.util.Scanner;
public class greatestno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number   :  ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number  :  ");
        int num2=sc.nextInt();
        System.out.print("Enter the third number   :  ");
        int num3=sc.nextInt();
        int greatest=findGreatest(num1, num2, num3);
        System.out.println();
        System.out.print("The greatest number is   :  " + greatest);
        System.out.println();
        System.out.println();
        sc.close();
    }

    public static int findGreatest(int num1,int num2,int num3) {
        int max=num1;
        if (num2>max) {
            max=num2;
        }
        if (num3>max) {
            max=num3;
        }
        return max;
    }
}