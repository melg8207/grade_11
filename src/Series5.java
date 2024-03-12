public class Series5 {
    public void process() {
        int n=20; // Number of terms in the series
        int multiplier=3; // The common difference between terms
        int currentTerm=2; // The first term of the series
        System.out.println("The series is : ");
        for(int i=0;i<n;i++) {
            if(i==n-1) {
                System.out.print(currentTerm+"x");
            } else {
                System.out.print(currentTerm+"x, ");
            }
            currentTerm+=multiplier;
        }
    }
    public static void main(String[] args) {
        Series5 obj=new Series5();
        obj.process();
    }
}
