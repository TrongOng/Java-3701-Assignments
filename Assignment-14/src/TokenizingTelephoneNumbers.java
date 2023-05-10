/*
(Tokenizing Telephone Numbers) 
Write an application that inputs a telephone number as a 
string in the form (555) 555-5555. The application should use 
String method split to extract the area code as a token, the first three 
digits of the phone number as a token and the last four digits of the phone 
number as a token. The seven digits of the phone number should be concatenated into 
one string. Both the area code and the phone number should be printed. Remember that you’ll 
have to change delimiter characters during the tokenization process.
 */
import java.util.Scanner;

public class TokenizingTelephoneNumbers {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phone number: (555) 555-5555");
        String sentence = scanner.nextLine();
    
        // process user sentence
        String[] tokens = sentence.split("[() -]");
        String areaCode = tokens[1];
        String firstThree = tokens[3];
        String lastFour = tokens[4];
    
        System.out.println("The tokens are: " + areaCode + " " + firstThree + " " + lastFour);
        System.out.println("Area Code: " + areaCode);
        System.out.println("First Three: " + firstThree);
        System.out.println("Last Four: " + lastFour);
    }
    
}
