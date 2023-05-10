/*
(Rational Numbers) 
Create a class called Rational for performing arithmetic with fractions. 
Write a program to test your class. Use integer variables to represent the private instance 
variables of the class—the numerator and the denominator. Provide a constructor that enables an 
object of this class to be initialized when it’s declared. The constructor should store the 
fraction in reduced form. The fraction

2/4

is equivalent to 1/2 and would be stored in the object as 1 in the numerator and 2 in the denominator. 
Provide a no-argument constructor with default values in case no initializers are provided. 
Provide public methods that perform each of the following operations:

Add two Rational numbers: The result of the addition should be stored in reduced form. Implement this as a static method.

Subtract two Rational numbers: The result of the subtraction should be stored in reduced form. Implement this as a static method.

Multiply two Rational numbers: The result of the multiplication should be stored in reduced form. Implement this as a static method.

Divide two Rational numbers: The result of the division should be stored in reduced form. Implement this as a static method.

Return a String representation of a Rational number in the form a/b, where a is the numerator and b is the denominator.

Return a String representation of a Rational number in floating-point format. (Consider providing formatting capabilities 
that enable the user of the class to specify the number of digits of precision to the right of the decimal point.)

*/
import java.util.*;


public class RationalNumbers {
    private int numerator;
    private int denominator;

    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
    public void simplify() {
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
    

    // Constructor
    public RationalNumbers(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    // get Fraction
    public static String getFraction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Equation with ' '");
        return input.nextLine();
    }
    // Compute
    public static RationalNumbers add(RationalNumbers one, RationalNumbers two) {
        int newNumerator = one.numerator * two.denominator + two.numerator * one.denominator;
        int newDenominator = one.denominator * two.denominator;
        return new RationalNumbers(newNumerator, newDenominator);
    }
    public static RationalNumbers subtract(RationalNumbers one, RationalNumbers two) {
        int newNumerator = one.numerator * two.denominator - two.numerator * one.denominator;
        int newDenominator = one.denominator * two.denominator;
        return new RationalNumbers(newNumerator, newDenominator);
    }
    public static RationalNumbers multiply(RationalNumbers one, RationalNumbers two) {
        int newNumerator = one.numerator * two.numerator;
        int newDenominator = one.denominator * two.denominator;
        return new RationalNumbers(newNumerator, newDenominator);
    }
    public static RationalNumbers divide(RationalNumbers one, RationalNumbers two) {
        int newNumerator = one.numerator * two.denominator;
        int newDenominator = one.denominator * two.numerator;
        return new RationalNumbers(newNumerator, newDenominator);
    }

    public static void main(String[] args) throws Exception {
        String equation = getFraction();
        String[] parts = equation.split(" ");

        String[] fractionsOne = parts[0].split("/");
        RationalNumbers fractionOne = new RationalNumbers(Integer.parseInt(fractionsOne[0]), Integer.parseInt(fractionsOne[1]));

        String[] fractionsTwo = parts[2].split("/");
        RationalNumbers fractionTwo = new RationalNumbers(Integer.parseInt(fractionsTwo[0]), Integer.parseInt(fractionsTwo[1]));

        RationalNumbers result = null;
        if (parts[1].equals("+")) {
            result = add(fractionOne, fractionTwo);
            result.simplify();
        } 
        else if (parts[1].equals("-")) {
            result = subtract(fractionOne, fractionTwo);
            result.simplify();
        } 
        else if (parts[1].equals("*")) {
            result = multiply(fractionOne, fractionTwo);
            result.simplify();
        } 
        else if (parts[1].equals("/")) {
            result = divide(fractionOne, fractionTwo);
            result.simplify();
        }
    
        System.out.println("Result: " + result.numerator + "/" + result.denominator);

    }

}
