import java.util.Scanner;
public class Decimal {
    static Scanner sc=new Scanner(System.in);
    double[] z=new double[5];
    public void input() {
        System.out.println("Enter any 5 decimals : ");
        for(int i=0;i<5;i++) {
            z[i]=sc.nextDouble();
        }
    }
    public void display() {
        System.out.println("Elements of the Array : ");
        for(int j=0;j<5;j++) {
            System.out.print(z[j]+", ");
        }
    }
    public static void main(String[]args) {
        Decimal obj=new Decimal();
        obj.input();
        obj.display();
    }
}
