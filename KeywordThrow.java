package mySirGJava;

public class KeywordThrow {

	public static void main(String[] args) {
		System.out.println("ABC");
		
		try // when we create our own exception, good practice is to catch the exception using try catch block. We can also handle it by using the throws keyword but the program will end.
		{
		throw new Exception("We can create our own exception delebrately using throw keyword");
		}
		catch(Exception e) {
			e.printStackTrace(); // method to print the the exception details.
			System.out.println(e.getMessage()); // method to print the exact error message.
		}
		
		System.out.println("PQR");

	}

}
 		// we can create our own appropriate Exception class object using the throw keyword inside the try block.