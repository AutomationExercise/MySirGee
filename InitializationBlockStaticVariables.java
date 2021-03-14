package mySirGJava;

public class InitializationBlockStaticVariables {
    int x;
	private static int k;
	static
	{
		System.out.println("Static Initialization Block:k= "+k);
		k=10;
	}
	
	public static void main(String[] args) { // 2 ways static initializer block will run.
		System.out.println(InitializationBlockStaticVariables.k); // 1st: static initializer will run when any static member of class is accessed by class name.
		//new StaticInitializationBlock(); // 2nd: static initialization block will be executed when we create the object of the class -- even dont need a reference for the object.
	}

}

// static block can only access the static class members -- can not access the instance members (variables and methods).
// static initializer declared in a class is executed when the class is initialized. also when some static member is accessed by class name following a dot.
// static initializer may be used to initialize the class variables of the class.
// return keyword cannot be used in static initialization block.
// this or super keywords can not be used in static block.