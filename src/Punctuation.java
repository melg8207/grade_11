import java.io.*;
public class Punctuation {
    public static void main(String[]args)throws IOException {
        int p=0;
        char chr;
        String str1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        str1= br.readLine();
        for(int i=0;i<str1.length();i++) {
            chr=str1.charAt(i);
            if(chr==','||chr=='.'||chr==';'||chr==':'||chr=='"'||chr=='!'||(chr=='\'')||chr=='?') {
                p=p+1;
            }
        }
        System.out.println("The number of punctuation symbols are: "+p);
    }
}
