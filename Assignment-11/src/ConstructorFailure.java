/*
 (Constructor Failure) 
 Write a program that shows a constructor passing information 
 about constructor failure to an exception handler. Define 
 class SomeClass, which throws an Exception in the constructor. 
 Your program should try to create an object of type SomeClass 
 and catch the exception that’s thrown from the constructor.
 */
public class ConstructorFailure {
    public static void main(String[] args) {
        try {
            SomeClass obj = new SomeClass();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

class SomeClass extends Exception{
    public SomeClass() throws Exception {
        // constructor failure
        throw new Exception("Constructor failure");
    }
}
