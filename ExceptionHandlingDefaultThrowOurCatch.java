package mySirGJava;

public class ExceptionHandlingDefaultThrowOurCatch {

	public static void main(String[] args) {
		
		System.out.println("Code before exception occured");
	try {
		System.out.println("Code in try block before exception will execute");
		System.out.println(3/0); // Arithmetic exception.
		System.out.println("Code in try block fter exception will not execute");
		} 
	catch(ArithmeticException e)
		{
		System.out.println("Code in catch block will execute");
		}
	finally
		{
		System.out.println("Code in finally block -- will execute even program ends");
		}

}}

/**
* Java default throw mechanism will create the appropriate Exception class object and throw it.
* Our try catch mechanism will catch the object and will print the message.
* program will not end, and 'code after exception occured' will be executed.
* Code in finally block will must execute even though the program will end because of exception occured.
**/
