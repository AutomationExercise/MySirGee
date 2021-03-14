package mySirGJava;

public class InitializationBlockInstanceVariables {

	private int x; // default value will be zero
	
	{ // instance initialization block without any name
		System.out.println("Initialization Block:x= "+x);
		x=5;
	}
	
	public InitializationBlockInstanceVariables() { // constructor -- has no return type
		System.out.println("Constructor:x= "+x);
	}
	
	public static void main(String[] args) {
		InitializationBlockInstanceVariables B1 = new InitializationBlockInstanceVariables();
		InitializationBlockInstanceVariables b2 = new InitializationBlockInstanceVariables();
	}
}

// 2 Types of Initialization Block/Initializer
// * 1. Instance Initializer Block
// * 2. Static Initialization Block
// An instance initializer or initialization block declared in a class is executed when an instance of the class is created.
// return keyword cannot be used in initialization block.
// instance initializers are permitted to refer to the current object via the keyword this and to use the keyword super.