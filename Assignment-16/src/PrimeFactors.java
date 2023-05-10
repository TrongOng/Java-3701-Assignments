/*
(Prime Numbers and Prime Factors) 
Write a program that takes a whole number input from a 
user and determines whether it’s prime. If the number is not 
prime, display its unique prime factors. Remember that a prime 
number’s factors are only 1 and the prime number itself. Every number 
that’s not prime has a unique prime factorization. For example, consider 
the number 54. The prime factors of 54 are 2, 3, 3 and 3. When the values are 
multiplied together, the result is 54. For the number 54, the prime factors output 
should be 2 and 3. Use Sets as part of your solution.*/

import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        while (input != -1) {
            HashSet<Integer> factorSet = new HashSet<Integer>();
            factorize(input, factorSet);

            if (factorSet.isEmpty()) {
                System.out.println("It's a prime: " + input);
            }
            else {
                System.out.println("Factors are: " + factorSet);
            }

            System.out.println("Please enter a number or type -1 to quit: ");
            input = scanner.nextInt();

        }
    }

    public static boolean factorize(int number, HashSet<Integer>set) {

        if (number == 0 || number == 1) {
            return false;
        }
        // loop through numbers that are less than or equal to number divide by 2
        for (int factor = 2; factor <= number/2; factor++) {
            // has a factor
            if (number % factor == 0) {
                set.add(factor);
            if (!factorize(number/factor, set))
                set.add(number/factor);
            return true;
            
            }
        }
        return false;
    }

    
}
