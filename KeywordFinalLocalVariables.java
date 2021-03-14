package mySirGJava;

public class KeywordFinalLocalVariables {

	public static void fun()
	{
		int x=5; // values can be re-assigned to local variable
		System.out.println("value of x: "+x);
		x=10;
		System.out.println("value of x: "+x);
		final int y=15;
		// y=10; we can not reassign the value to final y.
		System.out.println("value of y: "+y);
	}
	public static void main(String[] args) {
		fun(); // calling the static method
		
		
	}

}

	// Local variables that are final must be initialized before it is used, but you should remember this rule is applicable to non-final local variables too.
	// Once they are initialized, can not be altered.
	// local variables are by default blank.