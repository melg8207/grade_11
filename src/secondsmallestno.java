import java.util.Scanner;
public class secondsmallestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number   :  ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number  :  ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number   :  ");
        int num3 = sc.nextInt();
        int secondsmall = findsecondSmallest(num1, num2, num3);
        System.out.println();
        System.out.print("The second smallest number is   :  " + secondsmall);
        System.out.println();
        System.out.println();
        sc.close();
    }
    public static int findsecondSmallest(int num1,int num2,int num3) {
        int smallest=Math.min(num1,Math.min(num2,num3));
        if(num1==smallest) {
            return Math.min(num2,num3);
        }
        else if(num2==smallest) {
            return Math.min(num1,num3);
        }
        else {
            return Math.min(num1,num2);
        }
    }
}
