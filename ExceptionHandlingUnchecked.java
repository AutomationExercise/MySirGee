package mySirGJava;

public class ExceptionHandlingUnchecked {

	public static void main(String[] args) {
		try // write the code in try block where exception may occur.
		{System.out.println(3/0); 				// Java will throw an ArithmeticException class object.
		System.out.println("Inside try block"); // this code will not execute if exception occurs.
		}
		catch(ArithmeticException e) 			// our catch block will catch the Arithmetic class object, and reference variable e of ArithmaticException class will refer to this object.
		{
			System.out.println("Exception: "+e.getMessage()); // print the exception message.
			System.out.println("Inside catch block");
		}
		finally // this block will run even though the catch block is catching the oject.
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Outside of finally block"); // this code will print.
	}

}

	/** 
	 * The class Exception represents exceptions that a program faces due to abnormal or special conditions during execution.

	 ** What are two types of Exceptions?
	 1. Checked Exceptions: (Compile time Exceptions)
	 2. Unchecked Exceptions: (Run time Exceptions).
	 
	 * Unchecked Exceptions are RunntimeException and any of its subclassess.
	 * Examples of Unchecked Exceptions:
	 	ArrayIndexOutOfBounds, NullPointerException and so on, all these are subclasses of java.lang.RuntimeException class, which is a subclass of the Exception class.
	 
	 ** Points to remember:
	 1. For each try block there can be zero or more catch blocks, but only one finally block.
	 2. The catch blocks and finally block must always appear in conjunction with a try block.
	 3. A try block must be followed by eithe at least one catch block or one finally block.
	 4. The order exception handlers in the catch block must be from the most specific exception.
	 **/