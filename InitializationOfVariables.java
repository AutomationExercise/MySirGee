package mySirGJava;

public class InitializationOfVariables {

	private int x=5; // 1st way: assingning the values to a variable
	private int y; // variable will be initialized when created the object of the class.
	private int z; // variable will be initialized when created the object of the class.
	{ // 2nd way: assigning values by initializaton block
		y=10;
		System.out.println("value of y: "+y);
	}
	
	public InitializationOfVariables() // 3rd way: assigning values by constructor
	{
		z=15;
		System.out.println("value of z: "+z);
	}
	
	public static void main(String[] args) {
		InitializationOfVariables var = new InitializationOfVariables();
		System.out.println("value of x: "+var.x);

	}

}

	// instance member variables can be initialized by 3 ways:
 //* 1. by assigning the value to the varibale.
 //* 2. by initialization block.
 //* 3. by constructor