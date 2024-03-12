import java.io.*;
public class school {
    static InputStreamReader in=new InputStreamReader(System.in);
    static BufferedReader br=new BufferedReader(in);
    int category,yearsofserv;
    double basic,da,hra,cta,pf,gross,net,expallowance,totalbasic;
    public void input()throws IOException {
        System.out.println("----------------------------------------------------------");
        System.out.println("Category       Qualification       Experience Allowance ");
        System.out.println("1.             Primary              Rs.500/- per year");
        System.out.println("2.             TGT                  Rs.700/- per year");
        System.out.println("3.             PGT                  Rs.900/- per year");
        System.out.println("----------------------------------------------------------");
        System.out.println();
        System.out.print("Enter Category          :  ");
        category=Integer.parseInt(br.readLine());
        System.out.print("Enter Years of Service  :  ");
        yearsofserv=Integer.parseInt(br.readLine());
        System.out.print("Enter basic salary      :  ");
        basic=Double.parseDouble(br.readLine());
    }
    public void calculate() {
        switch(category) {
            case 1:
                expallowance=500*yearsofserv;
                totalbasic=basic+expallowance;
                break;
            case 2:
                expallowance=700*yearsofserv;
                totalbasic=basic+expallowance;
                break;
            case 3:
                expallowance=900*yearsofserv;
                totalbasic=basic+expallowance;
                break;
            default:
                System.out.println("An error occurred!");
                System.exit(0);
        }
        da=totalbasic*(40/100.0);
        hra=totalbasic*(20/100.0);
        cta=totalbasic*(10/100.0);
        pf=totalbasic*(8.33/100.0);
        gross=totalbasic+da+hra+cta;
        net=gross-pf;
    }
    public void display() {
        switch(category) {
            case 1:
                System.out.println();
                System.out.println();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Category       Qualification       Experience Allowance     Total Basic");
                System.out.println("1.             Primary             "+expallowance+"                   "+totalbasic+" Rs.");
                System.out.println("------------------------------------------------- Gross :   "+gross+" Rs.");
                System.out.println("------------------------------------------------- Net   :   "+net+" Rs.");
                System.out.println("-----------------------------------------------------------------------");
                break;
            case 2:
                System.out.println();
                System.out.println();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Category       Qualification       Experience Allowance     Total Basic");
                System.out.println("2.             TGT                 "+expallowance+"                   "+totalbasic+" Rs.");
                System.out.println("------------------------------------------------- Gross :   "+gross+" Rs.");
                System.out.println("------------------------------------------------- Net   :   "+net+" Rs.");
                System.out.println("-----------------------------------------------------------------------");
                break;
            case 3:
                System.out.println();
                System.out.println();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Category       Qualification       Experience Allowance     Total Basic");
                System.out.println("3.             PGT                 "+expallowance+"                   "+totalbasic+" Rs.");
                System.out.println("------------------------------------------------- Gross :   "+gross+" Rs.");
                System.out.println("------------------------------------------------- Net   :   "+net+" Rs.");
                System.out.println("-----------------------------------------------------------------------");
                break;
        }
    }
    public static void main(String[]args)throws IOException {
        school obj=new school();
        obj.input();
        obj.calculate();
        obj.display();
    }
}