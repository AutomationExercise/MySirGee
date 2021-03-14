package mySirGJava;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		HelloWorld.printStatment(); // static method called by class name following the dot.
		printStatment(); // static method can also be called by just method name.
		
	}
	public static void printStatment() {
		System.out.println("method -- printStatement");
	}
} // do not put semicolon here.

// Public -- 
// Static -- function can be called without creating the object of the class. Static functions can be called by two ways. 1. direct calling 2. calling by class name.
// Void -- it is a return type which means function will not return any thing.
// main -- function name.
// String [] args -- formal arguments. It is an arrary where many Strings can be received as arguments.
// System -- is  a pre-defined class.
// .out -- out is a static refference variable which is representing an object of PrintStream class.
// println -- pre-defined function of PrintStream class, which is receiving "Hello World" as a string aruguments which will be printed as such.
// when we use . after any class, it means we are going to access some static member of a class (could be a static variable, or static function).
// Inside the System class, there is out reference variable which is pointing to an object of PrintStream class which is calling one of it pre-defined functions -- println().