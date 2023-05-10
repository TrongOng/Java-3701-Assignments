// The program displays all of the Fibonacci values up to 40 using recursion. Using Lamddas and streams instead, display all of the values
import java.math.BigInteger;
import java.util.stream.*;
//recurvsive declaration of method fibonacci
public class FibonacciCalculator {
    private static BigInteger TWO = BigInteger.valueOf(2);

    public static BigInteger fibonacci(BigInteger number) {
        if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) { // base code
            return number;
        } else {
            return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
        }
    }

    public static void main(String[] args) {
        /*
        for (int counter = 0; counter <= 40; counter++) {
            System.out.printf("Fibonacci of %d is: %d%n", counter, fibonacci(BigInteger.valueOf(counter)));
        }
        */
        // Define a limit for the Fibonacci sequence
        Stream.iterate(new BigInteger[]{BigInteger.ZERO, BigInteger.ONE},
                       fib -> new BigInteger[] {fib[1], fib[0].add(fib[1])})
              .limit(40)
              .map(fib -> fib[0])
              .forEach(System.out::println);
            
        

    }
}

