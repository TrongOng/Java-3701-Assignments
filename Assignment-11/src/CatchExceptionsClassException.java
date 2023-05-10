/*Assignment 11 (Catching Exceptions Using Class Exception) 
Write a program that demonstrates how various exceptions are 
caught with catch (Exception exception) 
This time, define classes ExceptionA (which inherits from class Exception) 
and ExceptionB (which inherits from class ExceptionA). In your program, create 
try blocks that throw exceptions of types ExceptionA, ExceptionB, NullPointerException 
and IOException. All exceptions should be caught with catch blocks specifying type Exception. 
*/
import java.io.IOException;

public class CatchExceptionsClassException{
	public static void main(String[] args)
	{
		try{
			throw new ExceptionA();
		}
		catch(Exception e)

			{
				System.out.println(e);
			}
		try{
			throw new ExceptionB();
		}
		catch(Exception e2)

			{
				System.out.println(e2);
			}
		try{
			throw new NullPointerException();
		}
		catch(Exception e)

			{
				System.out.println(e);
			}
		try{
			throw new IOException();
		}
		catch(Exception e)

			{
				System.out.println(e);
			}
		
	}
}

class ExceptionA extends Exception
	{
		
	}
class ExceptionB extends ExceptionA
	{
		
	}


