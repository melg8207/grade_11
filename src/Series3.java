public class Series3 {
    public static int[] gen_series(int n) {
        int[] series=new int[n];
        for(int i=1;i<=n;i++) {
            int term=i*i-1;
            series[i-1]=term;
        }
        return series;
    }
    public static void main(String[] args) {
        int nTerms = 10;
        int[] series = gen_series(nTerms);

        for (int term : series) {
            System.out.print(term + ", ");
        }
    }
}
