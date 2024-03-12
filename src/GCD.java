/**
 * Working:
 * gcd(8,12)    //p=8 and q=12
 *   gcd(12%8,8) i.e. gcd(4,8)   //p=4 and q=8
 *      gcd(8%4,4) i.e. gcd(0,4)    //p=0 and q=4
 *              4
 */
public class GCD {
    int gcd(int p,int q) {
        if(p==0)
            return q;
        else
            return gcd(q%p,p);
    }
    /*
     * OR (using ternary operator)
     * int gcd(int p,int q)
     * { return(p==0)?q:gcd(q%p,p); }
     */
    public static void main(String[]args) {
        GCD obj=new GCD();
        int p=8;
        int q=12;
        int g=obj.gcd(p,q);
        System.out.println("GCD of "+p+" and "+q+" = "+g);
    }
}
