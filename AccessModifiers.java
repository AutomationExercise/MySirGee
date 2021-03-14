package mySirGJava;

class AccessModifiers { // outer class: can only be public or default -- no other access modifier can be used.
	public int x=5;
	public void fun() {
		System.out.println("method -- fun -- outer class");
	}
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		System.out.println("Value of x is : "+am.x);
		am.fun();
		
	AccessModifiers.Dummy.fun2(); // this how inner class is accessed.
		
	Test.fun1(); // Test class is calling its static function.
}
	static class Dummy { // inner class: may be public, private, protected or default.
		public static void fun2() {
			System.out.println("method -- fun2 -- inner class Dummy");
		}
	}
 public static class Test{
	 public static void fun1() {
		 System.out.println("method -- fun1 -- Test class");
	 }
		}
 }

 // Java supports four categories of accessibility rules.
	// 1. private, 2. protected, 3. public, and 4. default.
 // Access modifiers can be used for class, member variables, and member functions.
 // in java, if no access modifier is specified, it is outomatically considered as default.
 // public class: can be accessed from other packages too. we just need to import that package.
 // there can be only one pulic class in one java file (.java file). 
 // if we want to make more than classes as public in one package, just make classes as separate files.
 // the name of the java file must be the same as the name of the public class.
 // only public class can be accessed directly from the outside the package.

// *** Member variables and functions:
 // when members of the class are private, they can not be accessed from outside the class body. They can be only accessed from the same class in which they are declared.
 // when members are protected, they can be accessed from any class of the same package and child class from other package.
 // when members are public, they are accessible from any class of any package.
 // when members are default, they are accessible only from the class of the same package.