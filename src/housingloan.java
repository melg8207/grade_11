import java.io.*;
public class housingloan {
    static InputStreamReader in=new InputStreamReader(System.in);
    static BufferedReader br=new BufferedReader(in);
    double loanamt,downpaymt,remloanamt,totalamt; //emi per month per lakh for different time periods
    double[] emipermonthperlakh = {1450, 1325, 1250, 1175, 1100};
    double[] emipermonth = new double[emipermonthperlakh.length];
    public void input()throws IOException {
        //inputting loan amount
        System.out.println("Enter Loan Amount: ");
        loanamt=Double.parseDouble(br.readLine());
    }
    public void calculate() {
        downpaymt = loanamt * 0.1;        //calculating down payment
        remloanamt = loanamt - downpaymt; //calculating remaining loan amount

        //calculating emi for different time periods
        for (int i = 0; i < emipermonthperlakh.length; i++) {
            emipermonth[i] = remloanamt / 100000 * emipermonthperlakh[i];
        }
    }
    public void display() {
        //printing the total amount to be paid for different time periods
        System.out.println("Total amount to be paid for different time periods:");
        for (int i = 0; i < emipermonth.length; i++) {
            totalamt = emipermonth[i] * 12 * (i + 1);
            System.out.printf("%d years: %.2f INR%n", (i + 1) * 2, totalamt);
        }
    }
    public static void main(String[]args)throws IOException {
        housingloan ob=new housingloan(); //object creation
        ob.input();                       //calling input() method
        ob.calculate();                   //calling calculate() method
        ob.display();                     //calling display() method
    }
}
