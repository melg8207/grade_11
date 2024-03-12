import java.util.Scanner;
public class EvenOdd {
    static Scanner sc=new Scanner(System.in);
    int[] m=new int[10];
    int sum;
     public int getSumOfAll() {
        int totalSum=0;
        for(int j=0;j<10;j++) {
            totalSum+=m[j];
        }
        return totalSum;
    }
    public void input() {
        System.out.println("Enter any 10 integers : ");
        for(int i=0;i<10;i++) {
            m[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Even numbers : ");
        for(int j=0;j<10;j++) {
            if(m[j]%2==0) {
                System.out.print(m[j]+", ");
                sum+=m[j];
            }
        }
        System.out.println();
        System.out.println("Sum of all even integers : "+sum);
        System.out.println("Sum of all odd  integers : "+(getSumOfAll()-sum));
        System.out.println("Sum of all 10   integers : "+getSumOfAll());
    }
    public static void main(String[] args) {
        EvenOdd obj=new EvenOdd();
        obj.input();
    }
}
