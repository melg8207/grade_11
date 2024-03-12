/**
 * Program to test all types of recursion
 * Options: (1)To find factorial, (2)To find digits, (3)To find binary equivalent,
 * (4)To find the finite recursion, (5)To find the infinite recursion,
 * (6)To find the augmented recursion, and (7)To find the tail recursion
 */
import java.util.Scanner;
public class recursion {
    int fact(int x) {                       //recursive function to find factorial
        if(x==1)                            //base case (Factorial of any number less than 2 is 1)
            return 1;
        else
            return x*fact(x-1);          //recursive case
    }
    /*
     * (OR)
     * int fact(int x) {
     *    return (x<2)?1:x*fact(x-1);
     * }
     *
     * (ALGORITHM)
     * 5!=5*4!
     *      4!=4*3!
     *           3!=3*2!
     *                2!=2*1!
     *                     1!=1 (base-case)
     */
    int digit(int z) {                     //recursive function to find the number of digits
        if(z==0) {
            return 0;
        }else {
            return 1+digit(z/10);
        }
    }
    int sum(int n) {                     //recursive function to find the number of digits
        if(n==0) {
            return 0;
        }else {
            return n%10+sum(n/10);
        }
    }
    /*
     * (OR)
     * int sum(int n)
     * { return (n==0)?0:n%10+sum(n/10); }
     *
     * (ALGORITHM)
     * sum(492)
     *     492%10+sum(492/10)
     *       2   +sum(49)
     *                49%10+sum(49/10)
     *                 9   +sum(4)
     *                          4%10+sum(4/10)
     *                          4   +sum(0)
     *                                   0
     */
    long bin(int y) {                      //recursive function to find binary equivalent of a number
        if(y==0)
            return 0;
        else
            return y%2+10*bin(y/2);
    }
    void finite(int n) {                   //Using FIFO (First in-First out) and LIFO (Last in-Last out) concept
        if(n>0) {
            System.out.println(n);         //FIFO (First-in First-out)
            finite(--n);
            System.out.println(n);         //LIFO (Last-in Last-out)
        }
    }
    void infinite(int n) {                 //recursive function where the base case is not attainable
        if(n>0) {                          //never-ending error
            System.out.println(n);
            infinite(n--);
            System.out.println(n);
        }
    }
    void augmented(int n) {                //recursive function which implements augmented recursion concept
        if(n>0) {
           augmented(--n);
           System.out.println(n);          //process done after recursive call
        }
    }
    void tail(int n) {                     //recursive function which implements tail recursion concept
        if(n>0) {
            System.out.println(n);         //process done before recursive call
            tail(--n);
        }
    }
    public static void main(String[] args) {
        int x;long y;
        recursion obj=new recursion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int in=sc.nextInt();
        System.out.println("--------------- Options ---------------");
        System.out.println("1. To find factorial");
        System.out.println("2. To find digits");
        System.out.println("3. To find the sum of the digits");
        System.out.println("4. To find binary equivalent");
        System.out.println("5. To find the finite recursion");
        System.out.println("6. To find the infinite recursion");
        System.out.println("7. To find the augmented recursion");
        System.out.println("8. To find the tail recursion");
        System.out.println("---------------------------------------");
        System.out.println("Enter choice: ");
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
                x=obj.fact(in);
                System.out.println();
                System.out.print("Factorial = ");
                System.out.println(x);
                break;
            case 2:
                x=obj.digit(in);
                System.out.println();
                System.out.print("Number of digits = ");
                System.out.println(x);
                break;
            case 3:
                x=obj.sum(in);
                System.out.println();
                System.out.println("Sum of the digits = ");
                System.out.println(x);
                break;
            case 4:
                y=obj.bin(in);
                System.out.println();
                System.out.print("Binary equivalent = ");
                System.out.println(y);
                break;
            case 5:
                System.out.println();
                System.out.println("Finite recursion = ");
                obj.finite(in);
                break;
            case 6:
                System.out.println();
                System.out.println("Infinite recursion = ");
                obj.infinite(in);
                break;
            case 7:
                System.out.println();
                System.out.println("Augmented recursion = ");
                obj.augmented(in);
                break;
            case 8:
                System.out.println();
                System.out.println("Tail recursion = ");
                obj.tail(in);
                break;
        }
    }
}
