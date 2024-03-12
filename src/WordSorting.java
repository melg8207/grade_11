/**
 * Program to input a single sentence starting with uppercase and the rest lowercase letters and
 * a full stop.
 * The words will be arranged according to the length of the words in ascending order.
 * But if two words are of the same length, then the word occurring first in the input sentence will
 * come first
 */
import java.io.*;
import java.util.StringTokenizer;
public class WordSorting {
    public static void main(String[]args)throws IOException {
        WordSorting obj=new WordSorting();
        InputStreamReader i_o=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(i_o);
        System.out.println("Enter a single sentence with a full stop: ");
        String in=br.readLine();
        in=obj.capfirst(in);
        StringTokenizer tokenizer=new StringTokenizer(in," ");
        int numTokens=tokenizer.countTokens();      //counting no of tokens
        String[] words=new String[numTokens];       //creating array to store tokens
        //storing tokens in the array
        for(int i=0;i<numTokens;i++) {
            words[i]=tokenizer.nextToken();
        }
        //sorting the words based on length using a simple bubble sort
        for(int i=0;i<numTokens-1;i++) {
            for(int j=0;j<numTokens-i-1;j++) {
                if(words[j].length()>words[j+1].length()) {
                    //Swapping words if they are out of order based on length
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        //joining the sorted words into a sentence
        String sorted=String.join(" ",words);
        System.out.println("Original Sentence: "+in);
        System.out.println("Sorted Sentence  : "+sorted);
    }
    private String capfirst(String in) {
        if(in==null||in.isEmpty()) {
            return in;
        }
        return Character.toUpperCase(in.charAt(0))+in.substring(1);
    }
}
