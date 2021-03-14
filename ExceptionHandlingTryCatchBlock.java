package mySirGJava;

public class ExceptionHandlingTryCatchBlock {

	public static void main(String[] args) {
		try
		{
			int i = 9/0;
			System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: "+e.getMessage());
						
		}

	}

}
