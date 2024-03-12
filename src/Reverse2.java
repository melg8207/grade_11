import java.io.*;
public class Reverse2 {
    public static void main(String[]args)throws IOException {
        int i,l;
        char chr;
        String str1;
        StringBuilder str2=new StringBuilder(" ");
        StringBuilder str3=new StringBuilder(" ");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string: ");
        str1=in.readLine();
        str1=str1+" ";
        l=str1.length();
        for(i=0;i<l;i++) {
            chr=str1.charAt(i);
            if(chr==' ') {
                str3.insert(0,str2+" ");
                str2=new StringBuilder();
            }
            else {
                str2.append(chr);
            }
        }
        System.out.println("The reversed string: ");
        System.out.println(str3);
    }
}
