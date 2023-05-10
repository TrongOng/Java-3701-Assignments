/*(Reversing Digits) 
Write a method that takes an integer value and 
returns the number with its digits reversed. 
For example, given the number 7631, the method should 
return 1367. Incorporate the method into an application that 
reads a value from the user and displays the result. */

import java.util.Scanner;


public class ReversingDigits {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while(number != -1) {
            System.out.printf("%d Reversed is %d%n%n", number, reverseDigits(number));
            number = input.nextInt();
        }
    }

    public static int reverseDigits(int number) {

        int reverseNumber = 0;
        int placeValue;
    
        while (number > 0) {
            placeValue = number%10;
            number = number/10;
            reverseNumber = reverseNumber*10+placeValue;
        }
        return reverseNumber;
    }
}
