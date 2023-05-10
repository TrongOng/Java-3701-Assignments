/*(Sorting Words with a TreeSet) 
Write a program that uses a String method split to tokenize a 
line of text input by the user and places each token in a TreeSet. 
Print the elements of the TreeSet.*/

import java.util.*;


public class TreeSetTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Line of Text: ");
        String input = scanner.nextLine();
        
        Set <String> tree = new TreeSet<String>();
        StringTokenizer token = new StringTokenizer(input);
        
        while (token.hasMoreTokens()) {

            tree.add(token.nextToken());

        }
        System.out.println("Elements in tree: " + tree);
    }

    
}
