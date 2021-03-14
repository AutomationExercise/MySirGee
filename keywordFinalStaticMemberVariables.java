package mySirGJava;

public class keywordFinalStaticMemberVariables {

	private final static int x=5;
	private final static int y;
	// private final static int z;
	
	static // static initialization block
	{
		y=10;
	}
	
	// constructor can not be used to initialize the static variable in JAVA.
	
	/*
	 * public FinalkeywordStaticVariables() { z=15; }
	 */
	
	public static void main(String[] args) { // static variables are accessed in a static way.
		System.out.println("value of x: "+keywordFinalStaticMemberVariables.x);
		System.out.println("value of y: "+keywordFinalStaticMemberVariables.y);
	}
	}

	// final static variables can be accessed only by two ways:
	//* 1. assigning the direct values to the variables.
	//* 2. static initialization block
	//* constructor can not be used to initialize the static variables.
//final static member variable:
//* Static member variable when qualified with final keyword, becomes blank until initialized.
//* Final static variable cab be initalized during declaration or within the static block.