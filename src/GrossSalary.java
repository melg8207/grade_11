import java.util.Scanner;
public class GrossSalary {
    static Scanner sc=new Scanner(System.in);
    double basic,da,hra,cta,gross;
    int category;
    public void input() {
        System.out.println("Enter category : ");
        category=sc.nextInt();
        System.out.println("Enter basic salary : ");
        basic= sc.nextDouble();
    }
    public void calculate() {
        switch(category) {
            case 1:
                da=30/100.0*basic;
                hra=20/100.0*basic;
                cta=10/100.0*basic;
                gross=basic+da+hra+cta;
                break;
            case 2:
                da=25/100.0*basic;
                hra=15/100.0*basic;
                cta=5/100.0*basic;
                gross=basic+da+hra+cta;
                break;
            case 3:
                da=20/100.0*basic;
                hra=10/100.0*basic;
                gross=basic+da+hra;
                break;
            default:
                System.out.println("An error occurred!");
                System.exit(0);
        }
    }
    public static void main(String[]args) {
        System.out.println("1. Category I   : Post Graduate Teacher");
        System.out.println("2. Category II  : Trained Graduate Teacher");
        System.out.println("3. Category III : Primary Teacher");
        System.out.println("-------------------------------------------------");
        System.out.println();
        GrossSalary obj=new GrossSalary();
        obj.input();
        obj.calculate();
        System.out.println("Gross salary : "+obj.gross);
    }
}
