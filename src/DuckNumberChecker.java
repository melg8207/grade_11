import java.util.Scanner;
public class DuckNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(isDuck(number)) {
            System.out.println(number+" is a duck number.");
        }
        else {
            System.out.println(number+" is not a duck number.");
        }
    }

    static boolean isDuck(int num) {
        int originalNum=num;
        boolean hasZero=false;
        while(num>0) {
            int digit=num%10;
            if(digit==0) {
                hasZero=true;
                break;
            }
            num/=10;
        }
        return hasZero&&originalNum/10!=0;
    }
}
