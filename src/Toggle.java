//Program to toggle case between upper and lowercase
import java.io.*;
public class Toggle {
    public static void main(String[]args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,l;
        String str;
        StringBuilder str1= new StringBuilder(" ");
        char chr,chr1;
        System.out.println("To change upper to lower case and vice-versa");
        System.out.println("Enter a string: ");
        str=in.readLine();
        l=str.length();
        for(i=0;i<l;i++) {
            chr=str.charAt(i);
            if(chr>='A'&&chr<='Z') {
                chr1=Character.toLowerCase(chr);
                str1.append(chr1);
            }
            if(chr>='a'&&chr<='z') {
                chr1=Character.toUpperCase(chr);
                str1.append(chr1);
            }
            if(chr==' ')
                str1.append(" ");
        }
        System.out.println(str1);
    }
}
