package mySirGJava;

public class ExceptionHandlingOurThrowOurCatch { 

	public static void main(String[] args) {
		int balance = 5000;
		int withdrawlAmount = 6000;
		
		try
		{if(balance<withdrawlAmount)
			throw new ArithmeticException("Insufficient balance"); // we created the appropriate Exception class object and throw it.
			balance = balance-withdrawlAmount;
		}
		catch(ArithmeticException e) // our catch block will catch the object and print the message.
		{
			System.out.println("Exception: "+e.getMessage());
		}
		finally {
		System.out.println("Program continue");
		}
	}

}
/**
* Our throw mechanism will create the appropriate Exception class object and throw it.
* Our try catch mechanism will catch the object and will print the message.
* program will not end, and 'code after exception occured' will be executed.
* Code in finally block will must execute even though the program will end because of exception occured.
**/