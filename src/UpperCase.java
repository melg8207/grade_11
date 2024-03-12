import java.util.Scanner;
public class UpperCase {
    public static void main(String[]args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String in=scr.next();
        String word=in.toUpperCase();
        System.out.println("Uppercase: "+word);
        scr.close();
    }
}
