/******************************************************************************

(Arithmetic, Smallest and Largest)

Write an application that inputs three integers from the user and displays the 
sum, average, product, smallest and largest of the numbers.[Note: The calculation 
of the average in this exercise should result in an integer representation of the 
average. So, if the sum of the values is 7, the average should be 2, not 2.3333….

*******************************************************************************/
import java.util.Scanner;

public class Arithmetic {
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

        int sum = firstNumber+secondNumber+thirdNumber;
        int average = (firstNumber*secondNumber*thirdNumber)/3;
        int product = firstNumber*secondNumber*thirdNumber;
	    
	    System.out.printf("Numbers input: %d %d %d \n", firstNumber, secondNumber, thirdNumber);
	    
	    System.out.printf("The smallest number is: %d%n", smallest);
	    
	    System.out.printf("The largest number is: %d%n", largest);

        System.out.printf("The sum of numbers are: %d%n", sum);

        System.out.printf("The average of numbers are: %d%n", average);

        System.out.printf("The product of numbers are: %d%n", product);


        input.close();
	    
	}
}