import java.util.*;
public class Penultimate {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String wd,str1,str2;
        int a,b;
        System.out.println("Enter a Sentence: ");
        wd=sc.nextLine();
        System.out.println();
        a=wd.lastIndexOf(' ');
        str1=wd.substring(0,a);
        b=str1.lastIndexOf(' ');
        str2=wd.substring(b+1,a+1);
        System.out.println("The Original String: ");
        System.out.println(wd);
        System.out.println("The Penultimate word: ");
        System.out.println(str2);
    }
}
