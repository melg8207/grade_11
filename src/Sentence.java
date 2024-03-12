import java.util.Scanner;
public class Sentence {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence ending with a full stop:");
        String sentence=sc.nextLine();
        int ucase=0,lcase=0,space=0,spChar=0,vowel=0;
        // 7. Print each word and number of letters in each word
        String[] words=sentence.split("\\s");
        for(String word:words) {
            // Update counts
            ucase+=countU(word);
            lcase+=countL(word);
            space+=countS(word);
            spChar+=countSp(word);
            vowel+=countV(word);
            // Print each word and number of letters
            System.out.println("Word: "+word+", Number of Letters: "+word.length());
        }
        // Print the counts
        System.out.println("\nAnalysis Results:");
        System.out.println("Uppercase Letters: "+ucase);
        System.out.println("Lowercase Letters: "+lcase);
        System.out.println("Spaces: "+space);
        System.out.println("Special Characters: "+spChar);
        System.out.println("Words: "+words.length);
        System.out.println("Vowels: "+vowel);
    }
    private static int countU(String word) {  //Method to count uppercase letters
        int count=0;
        for(char c:word.toCharArray()) {
            if(Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
    private static int countL(String word) {  //Method to count lowercase letters
        int count=0;
        for(char c:word.toCharArray()) {
            if(Character.isLowerCase(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countS(String word) {  //Method to count spaces
        return word.split(" ").length-1;
    }

    private static int countSp(String word) { //Method to count special characters
        int count=0;
        for(char c:word.toCharArray()) {
            if(!Character.isLetterOrDigit(c)&&!Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countV(String word) {
        int count=0;
        for(char c:word.toCharArray()) {
            if("aeiouAEIOU".indexOf(c)!=-1) {
                count++;
            }
        }
        return count;
    }
}
