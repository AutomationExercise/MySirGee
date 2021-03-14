package mySirGJava;

import java.io.IOException;

public class ExceptionHandlingChecked { // Checked Exceptions -- arise at compile time.
										// Checked exceptions are handled by two ways: 
										// 1. Add throws keyword and appropriate Throwable class after the method name, -- compile time error will be handled but the program will end.
										// 2. We apply our try catch block to handle the exception, -- programe will not end and code after that will be executed.

	public static void main(String[] args) // throws IOException -- one way to handle checked exception.
	{
	
		try // second way to handle the checked exception.
		{
			throw new IOException("IOException"); // we created and throwed the IOException class exception object. In the constructor we added the message we want to print.
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e.getMessage());
		}
		}

}
	/**
	 * Checked Exceptions forces programmers to deal with the exception that may be thrown.
	 * Examples of checked exceptions: IOException, SQLException, IllegalThreadStateException.
	 * 'checked' means they will be checked at the compile time itself.
	 **/