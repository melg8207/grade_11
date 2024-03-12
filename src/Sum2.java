import java.util.Scanner;
public class Sum2 {
    public void process() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        int a=scanner.nextInt();
        System.out.print("Enter the number of terms 'm': ");
        int m=scanner.nextInt();
        double sum=0.0;
        System.out.println();
        System.out.print("Series : ");
        for (int i=1;i<=m;i++) {
            System.out.print(i+"/"+(int)Math.pow(a,i)+", ");
            sum+=i/Math.pow(a,i);
        }
        System.out.print("\n");
        System.out.println("Sum of the series: "+sum);
        scanner.close();
    }
    public static void main(String[] args) {
        Sum2 obj=new Sum2();
        obj.process();
    }
}
