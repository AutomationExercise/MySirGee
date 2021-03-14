package mySirGJava;

public class ExceptionHandlingExplicitThrow {

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
		System.out.println("Program continue");
	}
}

 	/**
 	 ** Why should we throw an exception object?
 	 	1. Because we want to set a different message.
 	 	2. Because java can not recognize the exceptional situation of business logic.
 	 	
 	 	* A program can explicitly throw an exception using the throw statement besides the implicit exception thrown.
 	 	* The Exception reference must be of type Throwable class or one of its subclasses.
 	 	* A detail message can be passed to the constructor when the exception object is created by us.
 	**/