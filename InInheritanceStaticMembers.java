package mySirGJava;

class Parent
{	static int y=4;
	public static void f1()
	{
		System.out.println("method -- f1 -- Parent class"); // this function f1 will be hidden by f1 in the 																child class.
	}
	public static void f3()
	{
		System.out.println("method -- f3 -- Parent class");
	}
}

class Children extends Parent
{	
	static int y; // hides the static variable of superclass.
	static // static block
	{
	y=5;
	}
	public static void f1()
	{
		System.out.println("method -- f1 -- Child class");
	}
}

public class InInheritanceStaticMembers {

	public static void main(String[] args) {
		
		Children.f1(); // child class f1 function will execute: This is called function hiding.
		Children.f3(); // Parent class f3 will be inherited in the child class.			
		System.out.println("y: "+Children.y); // it is printing child class static variable, so static varibles are not inherited.
	}

}

 // in any class, members are of two types:
	// * 1. Member variables,
	// * 2. Member functions.
 // Member variables are of two types:
	// * 1. Instance member variables,
	// * 2. Static member variables.
 // Member functions are of two types:
	// * 1. Instance member functions,
	// * 2. Static member functions.

	// All methods (static and instance methods) in Superclass that have different signatures than functions 		in 	Subclass are interited in the Subclass.
	// if Subclass has a static method m with the same signature as of the static method m present in the 		Superclass, then static method m in subclass hides the method of the Superclass.
	// if Subclass has a non-static method m with the same signature as of the non-static method m present in 		the Superclass, then non-static method m in subclass overrides the method of the Superclass.
	// it is a compile-time error if a static method hides an instance method.
	// it is compile-time error if an instance method overrides a static method.

	// static member variables are not inherited, they may hide.