/******************************************************************************

(Comparing Integers)

Write an application that asks the user to enter one integer, 
obtains it from the user and displays whether the number and its 
square are greater than, equal to, not equal to, or less than the number 100

*******************************************************************************/

import java.util.Scanner;

public class ComparingIntegers
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter  Number: ");
	    int number = input.nextInt();

		int square = number*number;
	    
		if (square > 100) {
			System.out.printf("The number (%d) is greater than 100. %n", number, square);
		}
	    else if (square < 100) {
			System.out.printf("The number (%d) is less than 100. %n", number, square);
		}
		else if (square == 100) {
			System.out.printf("The number (%d) is equal to 100. %n", number, square);
		}
	    
        input.close();

	}
}