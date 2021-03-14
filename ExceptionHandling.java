package mySirGJava;

public class ExceptionHandling {

	public static void main(String[] args) {
	// example 1: Run time error: ArithmaticException.
		System.out.println("First Line"); // this line will print because it will be executed before the exception arises.
		System.out.println("Result: "+3/0); // 3/0 is an arithmatic exceptions in Java. Java will throw an ArithmaticException class object. Java default catch mechanism will catch this object and print the default message. 
		System.out.println("Last Line"); // this line will not print because the program will end when the exceptions will arrise.
	
	// example 2: Compile time error.
		String s1; // s1 is reference variable and local variable because it is inside the main method. Local variable is by default blank.
		System.out.println("First Line");
		System.out.println("String length is: "+s1.length()); // we are trying to print the value of s1 which is blank by default, so it is a compile time error.
		System.out.println("Last Line");
		
	// example 3: Run time error: NullPointerExceptoin.
		String s2 = null; // now String is not blank but it is containing no value.
		System.out.println("First Line");
		System.out.println("String lenght is: "+s2.length()); // when reference variable has no value, and we try to find the length of that String, it gives NullPointerException.
		System.out.println("Last Line");
		
		// When the reference variable contains a null value, and we try to excess the methods of the object to which this reference variable (s2) may point to, it give NullPointerException.
	
	}

}
	/** 
	 
	 **What are four throw and catch options?
	 1. Default throw and default catch.
	 2. Default throw and our catch.
	 3. Our throw and default catch.
	 4. Our throw and our catch.
	 
	 ** What is exception?
	 Exceptions in Java are any abnormal, unexpected events or extraoridinary conditions that may occcur at runtime.
	 
	 ** What is Exception Handling?
	 Java exception handling is used to handle error conditions in a program systematically by taking the necessary actions.
	 
	 ** What are throw and catch keywords?
	 Java exceptions are raised with the throw keyword, and handled within a catch block.
	 
	 ** What is Throwable class?
	 A Throwable class provides a String variable that can be set by the subclasses to provide a detail message that provides more information of the exception occurred.
	 All classes of Throwables define a one parameter constructor that takes a string as the detail message.
	 The class Throwable provides getMessage() function to retrieve an exception.
	
	 ** How many types of Exceptions are there?
	 Two types of exceptions:
	 1. Checked Exceptions: (Compile time Exceptions) e.g. Thread.sleet();
	 2. Unchecked Exceptions: (Run time Exceptions) e.g. i=6/0.
	**/