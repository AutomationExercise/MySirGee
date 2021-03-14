package mySirGJava;

class Parent2
{	static int y=4;
	public static void f1()
	{
		System.out.println("method -- f1 -- of Parent class"); // this function f1 will be hidden by f1 in the child class.
	}
	public static void f3()
	{
		System.out.println("method -- f3 -- of Parent class");
	}
}

class Child2 extends Parent2
{	
	static int y; // hides the static variable of superclass.
	static // static block
	{
	y=5;
	}
	public static void f1()
	{
		System.out.println("method -- f1 -- of Child class");
	}
}

public class FunctionHiding {

	public static void main(String[] args) {
		
		Child2.f1(); // child class f1 function will execute: This is called function hiding.
		Child2.f3(); // Parent class f3 will be inherited in the child class.			
		System.out.println("y: "+Child2.y); // it is printing child class static variable, so static varibles are not inherited.
	}

}

/**
	*Function Hiding: a static function in child class hides the static function in super class.
	* Both functions must have the same signature in both the child class and super class.
**/