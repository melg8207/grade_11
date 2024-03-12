import java.util.Scanner;
public class TwinPrime {
    // Function to check if a number is prime
    public boolean isPrime(int n) {
        if(n<=1)
            return false;
        if(n<=3)
            return true;
        if(n%2==0||n%3==0)
            return false;
        for(int i=5;i*i<=n;i+=6) {
            if(n%i==0||n%(i+2)==0) {
                return false;
            }
        }
        return true;
    }
    // Function to check if a number is a twin prime
    public  boolean isTwinPrime(int n) {
        return isPrime(n)&&(isPrime(n-2)||isPrime(n+2));
    }
    public static void main(String[] args) {
        TwinPrime obj=new TwinPrime();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scanner.nextInt();
        scanner.close();
        if(obj.isTwinPrime(num)) {
            System.out.println(num+" is a twin prime number");
        } else {
            System.out.println(num+" is not a twin prime number");
        }
    }
}
