/*
 (Displaying a Sentence with Its Words Reversed) 
 Write an application that inputs a line of text, tokenizes the 
 line with String method split and outputs the tokens in reverse order. 
 Use space characters as delimiters.
 */
import java.util.Scanner;
import java.lang.*;

public class SentenceReverse{
  public static void main(String [] args) {
    //get sentence
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a sentence and press Enter");
    String sentence = scanner.nextLine();

    // process user sentence
    String[] tokens = sentence.split(" ");
    System.out.printf("Number of elements: %d%nThe tokens are: %n", tokens.length);

    for (int i = tokens.length-1; i >= 0; i--) {
        System.out.print(tokens[i] + " ");
    }
    
  }

}

