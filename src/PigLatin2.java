//To write a word in Piglatin form
import java.io.*;
public class PigLatin2 {
    public static void main(String[]args)throws IOException {
        int i;
        char chr;
        String str1,str2,str3;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("Enter a String: ");
        str1=br.readLine();
        System.out.println("Word in Piglatin: ");
        for(i=0;i<str1.length();i++) {
            chr=str1.charAt(i);
            if(chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U'||chr=='a'||chr=='e'||
            chr=='i'||chr=='o'||chr=='u')
                break;
        }
        str2=str1.substring(i);
        str3=str1.substring(0,i);
        System.out.println(str2+str3+"ay");
    }
}
