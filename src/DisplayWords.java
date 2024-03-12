import java.util.Scanner;
public class DisplayWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence=sc.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}