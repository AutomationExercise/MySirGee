package mySirGJava;

public class ExceptionHandlingOurThrowDefaultCatch {

	public static void main(String[] args) {
		int balance = 5000;
		int withdrawlAmount = 6000;
		
		if(balance<withdrawlAmount)
			throw new ArithmeticException("Insufficient balance"); // we created the appropriate Exception class object and throw it.
																	// we can incorporate message of our choice in the constructor.
			balance = balance-withdrawlAmount;
			System.out.println("Transaction Successfully completed");
			System.out.println("Program continue");
		}

	}
/**
* We create an appropriate Exception class object and throwd it.
* Java default catch mechanism will catch the object and will print the message.
* program will end, and 'code after exception occured' will be not be executed in case exception occurs.
**/


