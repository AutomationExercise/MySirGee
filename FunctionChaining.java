package mySirGJava;

public class FunctionChaining { // methods called within other methods.

	public static void main(String[] args) {
		FunctionChaining mc = new FunctionChaining();
		
		mc.sum(); // sum method is called within main method.
		System.out.println("method -- main");
	}
	public void sum() throws ArithmeticException // sum method will catch the exception and will throw it again.
	{				// we can call a method directly within another method if both are non-static in nature.
			div(); // div method is called within sum method.
		System.out.println("method -- sum");
	}
	public void div() throws ArithmeticException // when exception occurs, div method will throw the exception.
	{
		System.out.println("method -- div");
	}

}
