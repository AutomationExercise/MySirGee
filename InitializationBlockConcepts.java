package mySirGJava;

public class InitializationBlockConcepts {
	
	private int x;
	static private int y;
	
	// Instance Initialization Block
	{
		System.out.println("inside of -- instance initialization block");
		System.out.println("Instance Initialization Block:x= "+x);
		x=10;
		System.out.println("Value of x: "+x);
	}
	
	static // static initialization block will run first than instance initializatoin block
	{
		System.out.println("inside of -- static initalization block");
		System.out.println("Static Initialization Block:y= "+y); // static initialization block
		y=20;
		System.out.println("Value of y: "+y);
	}
	
	public InitializationBlockConcepts() // constructor
	{
		System.out.println("constructor -- with no arguments");
		System.out.println("Constructor:x= "+x);
	}
	public InitializationBlockConcepts(int y) // constructor overloading
	{
		System.out.println("constructor -- with one argument");
		System.out.println("Constructor:y= "+y);
	}
	
	public static void main(String[] args) {
		InitializationBlockConcepts bc1 = new InitializationBlockConcepts();
		System.out.println("Value of x= "+bc1.x);
		System.out.println("Value of y= "+InitializationBlockConcepts.y);
		InitializationBlockConcepts bc2 = new InitializationBlockConcepts(50);
		System.out.println("Value of x= "+bc2.x); 
}

}
