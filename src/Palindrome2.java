public class Palindrome2 {
    int n,rem,nos,n1;
    public void process() {
        for(n=101;n<=700;n++) {
            nos=n;
            n1=0;
            while(nos!=0) {
                rem=nos%10;
                n1=(n1*10)+rem;
                nos=nos/10;
            }
            if(n1==n)
                System.out.println(n+" is palindrome");
        }
    }
    public static void main(String[]args) {
        Palindrome2 obj=new Palindrome2();
        obj.process();
    }
}
