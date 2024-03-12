//Program to replace consonants with the previous letter or the next consonant letter
import java.io.*;
public class Replace {
    public static void main(String[]args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a sentence in upper case: ");
        String str=in.readLine();
        int p=str.length();
        StringBuilder word=new StringBuilder();
        char ch;
        for(int i=0;i<p;i++) {
            ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                word.append(ch);
            } else if(ch!=' ') {
                char chr=(char)(((int)ch)-1);
                if(chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U') {
                    chr=(char)(((int)ch)+1);
                }
                word.append(chr);
            }
            if(ch==' ')
                word.append(" ");
        }
        System.out.println(word);
    }
}
