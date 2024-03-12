import java.util.Scanner;
public class SeriesSum {
    // Method to calculate the sum of the series
    static double series(int n) {
        double sum=0;
        int factorial=1;
        int currentSum=0;
        for (int i=1;i<=n;i++) {
            currentSum+=i;
            factorial*=i;
            sum+=(double)currentSum/factorial;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=scanner.nextInt();
        scanner.close();
        double result=series(n);
        System.out.println("Sum of the series S for n = "+n+" is: "+result);
    }
}