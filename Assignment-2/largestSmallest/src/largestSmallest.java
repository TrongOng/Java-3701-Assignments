/******************************************************************************

(Largest and Smallest Integers)

Write an application that reads five integers and determines and prints the 
largest and smallest integers in the group.

*******************************************************************************/
import java.util.Scanner;

public class largestSmallest
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter First Number: ");
	    int firstNumber = input.nextInt();
	    
	    int smallest = firstNumber;
	    int largest = firstNumber;
	    
	    System.out.print("Enter Second Number: ");
	    int secondNumber = input.nextInt();
	    
	    if(secondNumber < smallest) {
	        smallest = secondNumber;
	    }
	    if(secondNumber > largest) {
	        
	        largest = secondNumber;
	        
	    }
	    
	    System.out.print("Enter Third Number: ");
	    int thirdNumber = input.nextInt();
	    
	    if(thirdNumber < smallest) {
	        smallest = thirdNumber;
	    }
	    if(thirdNumber > largest) {
	        
	        largest = thirdNumber;
	        
	    }
	    
	    System.out.print("Enter Fourth Number: ");
	    int fourthNumber = input.nextInt();
	    
	    if(fourthNumber < smallest) {
	        smallest = fourthNumber;
	    }
	    if(fourthNumber > largest) {
	        
	        largest = fourthNumber;
	        
	    }
	    
	    System.out.print("Enter Fifth Number: ");
	    int fifthNumber = input.nextInt();
	    
	    if(fourthNumber < smallest) {
	        smallest = fifthNumber;
	    }
	    if(fifthNumber > largest) {
	        
	        largest = fifthNumber;
	        
	    }
	    
	    System.out.printf("Numbers input: %d %d %d %d %d%n%n", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
	    
	    System.out.printf("The smallest number is: %d%n", smallest);
	    
	    System.out.printf("The largest number is: %d%n", largest);
	    

        input.close();
	    
	}
}
