/*(Duplicate Elimination) 
Write a program that reads in a series of first names and 
eliminates duplicates by storing them in a Set. Allow the user to search for a 
first name. */

import java.util.*;

public class SetTest{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Set <String> names = new HashSet<String>();

        getNames(names);
        searchNames(names);


    }

    public static void getNames(Set<String> names) {
        System.out.println("Add a name to the set type \"end\" when finished:\n");
        String input = scanner.next();

        while (!input.equals("end")) {
            if (!names.contains(input)) {
                names.add(input);
                System.out.println(input + " inserted");
            }
            else {
                System.out.println(input + " exists in set");
            }
            System.out.println("Add a name to the set type \"end\" when finished:\n");
            input = scanner.next();
        }
    }

    private static void searchNames(Set<String> names) {
        System.out.println("Search a name and type end to quit\n");
        String input = scanner.next();

        while (!input.equals("end")) {
            if (!names.contains(input)) {
                System.out.println(input + " found in the set");
            }
            else {
                System.out.println(input + " does not exists in set");
            }
            System.out.println("Search a name and type end to quit\n");
            input = scanner.next();

        }
    }
}