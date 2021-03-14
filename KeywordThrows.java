package mySirGJava;

public class KeywordThrows {

	public static void main(String[] args)
	{
		KeywordThrows kw = new KeywordThrows();
		
		
		try // try catch block catches the exception. the whole method or individual code can be included inside the try catch block.
		{
			kw.div();
		}
		catch(ArithmeticException e) 
		{
		System.out.println(e.getMessage());
		}
	
	}
	
	 public void div() throws ArithmeticException // method div throws the exception.
	 {
		 int i = 9/0;
	
	 }
}
		// throws keyword is used to throw the exception which will be handled by either JVM or by try-catch block by us.
	
