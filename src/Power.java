/**
 * Working:
 * power(3,4)       //a=3,b=4 i.e. 3^4
 *       3*power(3,3)      //a=3,b=3 i.e. 3^3
 *               3*power(3,2)     //a=3,b=2 i.e. 3^2
 *                       3*power(3,1)     //a=3,b=1 i.e. 3^1
 *                               3*power(3,0)    //3^0
 *                                       1
 */
public class Power {
    public static void main(String[]args) {
        Power obj=new Power();
        int a=3;
        int b=4;
        int pow=obj.power(a,b);
        System.out.println("The power of "+a+"^"+b+" = "+pow);
    }
    int power(int a,int b) {
        if(b==0)
            return 1;
        else
            return a*power(a,b-1);
    }
    /*
     * OR (using ternary operator)
     * int power(int a,int b)
     * { return(b==0)?1:a*power(a,b-1); }
     */
}
