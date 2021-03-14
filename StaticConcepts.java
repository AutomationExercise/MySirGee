package mySirGJava;

class StaticConcepts {
	int x; // instance member variable
	static int y; // static member variable
	private static int z;
	
	public void fun1() { 
		System.out.println("method -- fun1 -- non-static method");
	} // instance member function
	
	public static void fun2() {
		System.out.println("method -- fun2 -- static method");
	} // static member function
 
	public static class Test { // inner static class of StaticConcepts class
	 public static String country= "Pakistan";
	 public static void fun3() {
		 System.out.println("method -- fun3 --inner class static method");
	 }
 }
 
 public static class Hello {
	 public static void main (String[] args)
	 {
		 // instance member variables and functions can be accessed only by creating the object of the class.
		StaticConcepts sc=new StaticConcepts();
		 sc.x=5;
		 sc.fun1();
		
		 // static member variables and functions can be accessed without creating the object of the class.
		 // way 1: calling the static variables and functions by class name using the dot (.)
		 StaticConcepts.fun2();
		 
		 System.out.println("default value of y: "+y); // if no values are assigned to static variables, then they contain default values e.g. 0 value in int type variable.
		 System.out.println("default value of z: "+z);
		 
		 StaticConcepts.y=4;
		 StaticConcepts.z=5;
		 System.out.println(StaticConcepts.y);
		 System.out.println(StaticConcepts.z);
		
		 // way 2: calling the static variables and functions directly without the class name and dot operator. 
		 fun2();
		 y=3;
		 z=4;
		 System.out.println(y);
		 System.out.println(z);
		
		 // static variables and static functions of static inner class are called like this:
		 // 1. inner static class (Test) is called by its outer class name (StaticConcepts).
		 // 2. then, static variables and functions of inner class are called by inner class (Test).
		 StaticConcepts.Test.fun3();
		 String country = StaticConcepts.Test.country;
		 System.out.println(country);
		 
	 }
 }
}
 // 1. static member variable also called class variables
 // 2. static member function
 // 3. static inner class
 // we can not have local static member variables in methods.
 // * how can we make a static variable: -- by writing static keyword before the variable.
 // static variables are declared in the class using static keyword.
 // static variables are by default initialized to its default value. e.g. int a; will have by default value of 0.
 // static variables has a single copy for the whole class and does not depend on the objects.
 // static member variables will contain class specific values e.g. interest rate for banking apps.
 // static functions defined inside the class are qualified with the keyword static
 // static function can only access static members of the same class
 // static function can be invoked using class name and dot operator
 // static functions can only access the static memeber variables, because these functions are called without creating the object of the class.
