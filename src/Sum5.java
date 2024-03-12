public class Sum5 {
    public void process() {
        int n=7; // Number of terms in the series
        int sum=0;
        int term=1;
        System.out.println();
        System.out.print("Series : ");
        for(int i=1;i<=n;i++) {
            term*=i; // Calculate the current term (1 * 2, 1 * 2 * 3, ...)
            System.out.print(term);
            if(i<n)
                System.out.print(", ");
            sum+=term; // Add the current term to the sum
        }
        System.out.print("\n");
        System.out.println("Sum of the series: "+sum);
    }
    public static void main(String[] args) {
        Sum5 obj=new Sum5();
        obj.process();
    }
}
