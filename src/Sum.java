/**
 * Working:
 * sum(492)    //value of n=492
 *     492%10+sum(492/10)
 *       2   +sum(49)
 *      49%10+sum(49/10)
 *       9   +sum(4)
 *       4%10+sum(4/10)
 *       4   +sum(0)
 *                0
 *
 */
public class Sum {
    int sum(int n) {
        if(n==0)
            return 0;
        else
            return n%10+sum(n/10);
    }
    /*
     * OR (using ternary operator)
     * int sum(int n)
     * { return(n==0)?0:n%10+sum(n/10); }
     */
    public static void main(String[]args) {
        Sum obj=new Sum();
        int n=492;
        int s= obj.sum(n);
        System.out.println("Sum of the digits of "+n+" = "+s);
    }
}
