package mySirGJava;

public class ExceptionHandlingThrowsKeyword {

	public static void main(String[] args) { // main method will catch the exception and will throw it again. Then the JVM will catch the exception and the program will end.
		ExceptionHandlingThrowsKeyword obj = new ExceptionHandlingThrowsKeyword();
		
		obj.sum();

	}
	public void sum() // sum method will catch the exception and will throw it again.
	{	
	try 
	{ // we catch the exception before it goes to JVM
			div(); // method throwing the exception.
	}
	catch(ArithmeticException e) {
		System.out.println("Inside catch block");
	}
	}
	public void div() throws ArithmeticException // when exception occurs, div method will throw the exception.
	{
		int i = 9/0; // unchecked exception.
		System.out.println(i);
	}
}
