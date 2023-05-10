/*
(Rethrowing Exceptions) 
Write a program that illustrates rethrowing an exception. 
Define methods someMethod and someMethod2. Method someMethod2 
should initially throw an exception. Method someMethod should 
call someMethod2, catch the exception and rethrow it. 
Call someMethod from method main, and catch the rethrown 
exception. Print the stack trace of this exception.
 */
public class RethrowingExceptions {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Exception caught in someMethod");
            throw e;
        }
    }

    public static void someMethod2() throws Exception {
        System.out.println("someMethod2 throwing an exception");
        throw new Exception("someMethod2 exception");
    }
}
