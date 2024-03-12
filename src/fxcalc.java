import java.io.*;
public class fxcalc {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int x;
    double fx;
    public void input()throws IOException {
        System.out.print("Enter the value of x: ");
        x=Integer.parseInt(br.readLine());
        System.out.println();

    }
    public void calculate() {
        if(x>=-3&&x<=-1) {
            fx=(double)(x+2)/(2*x+1);
            System.out.println("f(x) = (x+2)/(2x+1) ; -3<=x<=-1");
            System.out.println("f("+x+") = ("+x+"+2)/(2*"+x+"+1)");
            System.out.println("f("+x+") = "+fx);
        } else if (x==0) {
            fx=(double)(-1)/(x+1);
            System.out.println("f(x) = (2x-1)/(x+1) ;  x = 0");
            System.out.println("f("+x+") = (2*"+x+"-1)/("+x+"+1)");
            System.out.println("f("+x+") = "+fx);
        } else if (x>=1&&x<=3) {
            fx=(double)(2*x+1)/(2*x-1);
            System.out.println("f(x) = (2x+1)/(2x-1) ; 1<=x<=3");
            System.out.println("f("+x+") = (2*"+x+"+1)/(2*"+x+"-1)");
            System.out.println("f("+x+") = "+fx);
        } else {
            System.out.println("The entered value is not within the range between -3 to 3!");
            System.exit(0);
        }
    }
    public static void main(String[]args)throws IOException {
        fxcalc obj=new fxcalc();
        obj.input();
        obj.calculate();
    }
}
