/*Assignment 11 (Catching Exceptions with Superclasses) 
Use inheritance to create 
an exception superclass (called ExceptionA) and exception subclasses 
ExceptionB and ExceptionC, where ExceptionB inherits from ExceptionA 
and ExceptionC inherits from ExceptionB. Write a program to demonstrate 
that the catch block for type ExceptionA catches exceptions of types ExceptionB 
and ExceptionC.
*/
public class CatchExceptionsSuperclass {

		public static void main(String[] args)
		{
			try{
				throw new ExceptionC();
			}
			catch(ExceptionA exception1)
				{
					System.err.println("First exception subclass caught\n");
				}
			try{
				throw new ExceptionB();
			}
			 catch(ExceptionA exception2)
				{
					System.err.println("Second exception subclass caught\n");
				}
		}
}

class ExceptionA extends Exception
	{
		
	}

class ExceptionB extends ExceptionA
	{
		
	}

class ExceptionC extends ExceptionB
	{
		
	}