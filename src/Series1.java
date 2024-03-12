public class Series1 {
    int n=7;
    public void process() {
        System.out.println("The series is :");
        for(int i=1;i<=n;i++) {
            int sq=i*i;
            System.out.print(sq);
            if(i<n)
                System.out.print(", ");
        }
        System.out.println();
    }
    public static void main(String[]args) {
        Series1 obj=new Series1();
        obj.process();
    }
}
