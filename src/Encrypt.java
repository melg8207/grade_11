//Program to Encrypt/Decrypt a String
import java.io.*;
public class Encrypt {
    public static void main(String[]args)throws IOException {
        int p;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word: ");
        String str=br.readLine();
        System.out.println("The required Encryption of the word: ");
        for(int i=0;i<str.length();i++) {
            char chr=str.charAt(i);
            if((chr>='a'&&chr<='y')||(chr>='A'&&chr<='Y')) {
                if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'||chr=='A'||chr=='E'||
                chr=='I'||chr=='O'||chr=='U') {
                    p=chr+2;
                    chr=(char)(p);
                }
                else {
                    p=chr+1;
                    chr=(char)(p);
                }
            }
            else if(chr=='z'||chr=='Z') {
                p=chr-25;
                chr=(char)(p);
            }
            System.out.print(chr);
        }
        System.out.println();
    }
}
