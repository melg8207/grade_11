import java.util.Scanner;
public class Sum3 {
    public void process() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        double a=scanner.nextDouble();
        System.out.print("Enter the value of 'b': ");
        double b=scanner.nextDouble();
        System.out.print("Enter the number of terms (x): ");
        int x=scanner.nextInt();
        double sum=1.0; // Initialize the sum with the first term (1)
        System.out.println();
        System.out.print("Series : 1, ");
        for(int i=1;i<=x;i++) {
            System.out.print((int)Math.pow(a,2*i)+"/"+(int)Math.pow(b,i+2)+", ");
            double term=Math.pow(a,2*i)/Math.pow(b,i+2);
            sum+=term;
        }
        System.out.print("\n");
        System.out.println("Sum of the series: "+sum);
        scanner.close();
    }
    public static void main(String[] args) {
        Sum3 obj=new Sum3();
        obj.process();
    }
}
