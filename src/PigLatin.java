import java.util.Scanner;
public class PigLatin {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence=sc.nextLine();
        // Convert the sentence to Pig Latin
        String p_sentence=convert(sentence);
        System.out.println("Pig Latin: "+p_sentence);
    }
    // Function to convert a word into Pig Latin
    private static String wTo_PigLatin(String word) {
        char char1=Character.toLowerCase(word.charAt(0));
        if(isVowel(char1)) {
            return word+"way";
        }else {
            int v_Index=findIndex(word);
            return word.substring(v_Index)+word.substring(0,v_Index)+"ay";
        }
    }

    // Function to convert a sentence to Pig Latin
    private static String convert(String sentence) {
        StringBuilder pigLatin=new StringBuilder();
        // Split the sentence into words
        String[] words=sentence.split("\\s+");
        // Convert each word to Pig Latin
        for (String word:words) {
            pigLatin.append(wTo_PigLatin(word)).append(" ");
        }
        return pigLatin.toString().trim();
    }
    // Function to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
    // Function to find the index of the first vowel in a word
    private static int findIndex(String word) {
        for(int i=0;i<word.length();i++) {
            if(isVowel(word.charAt(i))) {
                return i;
            }
        }
        return -1; // No vowel found
    }
}
