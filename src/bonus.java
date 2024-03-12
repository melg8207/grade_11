import java.util.Scanner;
public class bonus {
    static Scanner sc=new Scanner(System.in);
    double basic,yrlybasic,bonus,total;
    char grade;
    public void input() {
        System.out.println("------------------- Annual Bonus  Scheme ------------------");
        System.out.println();
        System.out.println("Type               Grade       Bonus");
        System.out.println("For officers       A           12% of annual basic");
        System.out.println("For supervisors    B           10% of annual basic");
        System.out.println("For workers        C           8.33% of annual basic");
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Enter monthly basic: ");
        basic=sc.nextDouble();
        System.out.println("Enter grade: ");
        grade=sc.next().charAt(0);
        System.out.println();
    }
    public void calculate() {
        yrlybasic=basic*12;
        switch(grade) {
            case 'A':
                bonus=(yrlybasic)*12/100;
                total=bonus+yrlybasic;
                System.out.println("Bonus = "+bonus);
                System.out.println("Total yearly salary with bonus:  "+total);
                break;
            case 'B':
                bonus=(yrlybasic)*10/100;
                total=bonus+yrlybasic;
                System.out.println("Bonus = "+bonus);
                System.out.println("Total yearly salary with bonus:  "+total);
                break;
            case 'C':
                bonus=(yrlybasic)*8.33/100;
                total=bonus+yrlybasic;
                System.out.println("Bonus = "+bonus);
                System.out.println("Total yearly salary with bonus:  "+total);
                break;
        }
    }
    public static void main(String[]args) {
        bonus obj=new bonus();
        obj.input();
        obj.calculate();
    }
}
