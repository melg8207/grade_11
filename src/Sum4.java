import java.util.Scanner;
public class Sum4 {
    public void process() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x=scanner.nextDouble();
        System.out.print("Enter the number of terms (m): ");
        int m=scanner.nextInt();
        double sum=series(x, m);
        System.out.println("Sum of the series: " + sum);
        scanner.close();
    }
    public static double series(double x, int m) {
        double sum=0;
        boolean addTerm=true;
        System.out.println();
        System.out.print("Series : 1, ");
        for(int i=2;i<=m;i++) {
            System.out.print("1/"+(int)Math.pow(x,i)+", ");
            double term=1.0/Math.pow(x,i);
            if(addTerm) {
                sum+=term;
            }
            else {
                sum-=term;
            }
            addTerm=!addTerm;
        }
        System.out.print("\n");
        return 1+sum; // Add the first term (1) to the sum
    }
    public static void main(String[] args) {
       Sum4 obj=new Sum4();
       obj.process();
    }
}
