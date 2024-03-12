import java.io.*;
public class Combinations {
    public static void main(String[]args)throws IOException {
        String str;
        int i,j,l,k;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a three letter word: ");
        str=in.readLine();
        l=str.length();
        System.out.println("The required combinations of the word: ");
        for(i=0;i<l;i++) {
            for(j=0;j<l;j++) {
                for(k=0;k<l;k++) {
                    if(i!=j&&j!=k&&k!=i)
                        System.out.println(str.charAt(i)+String.valueOf(str.charAt(j))+str.charAt(k));
                }
                System.out.println();
            }
        }
    }
}
