package mySirGJava;

public class ExceptionHandlingDefaultThrowDefaultCatch {

	public static void main(String[] args) {
		System.out.println("Code before exception occured");
		System.out.println(3/0); // ArithmeticException.
		System.out.println("Code after exception occured");

	} 
	}

	/**
	*Java default throw mechanism will create the appropriate Exception class object and throw it.
	*Java default catch mechanism will catch the object and will print the message.
	*program will end, and 'code after exception occured' will not execute.
	**/