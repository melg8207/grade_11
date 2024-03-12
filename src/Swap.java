import java.util.Scanner;
public class Swap {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        Swap obj=new Swap();
        System.out.print("Enter a word: ");
        String in=sc.nextLine();
        String out=obj.swap(in);
        System.out.println("Output: "+out);
    }

    // Method to swap the first and last letters of a word
    private String swap(String word) {
        if(word.length()>=2) {
            // Extract the first and last letters
            char first=word.charAt(0);
            char last=word.charAt(word.length()-1);
            // Form the new word by swapping the first and last letters
            return last+word.substring(1,word.length()-1)+first;
        }else {
            // If the word has less than two characters, return the original word
            return word;
        }
    }
}
