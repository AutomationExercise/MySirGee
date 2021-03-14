package mySirGJava;

abstract class Person3{
	// * abstract int x; variables can not be abstract.
	abstract void interest(); // abstract method contains no implementation, means no body.
	public void show() { // abstract class can have both abstract and non-abstract methods.
		System.out.println("method -- show() -- non-abstract method");
	}
}

class Student3 extends Person3{
	void interest() { // we must override the abstract interest() method in the super class, otherwise we must make the Student3 class as abstract because it is inheriting the abstract method.
		System.out.println("method -- interest() -- overriding the abstract method");
	}
}

public class AbstractMethodInheritance {

	public static void main(String[] args) {
		Student3 st = new Student3();
		st.interest();
		st.show();

	}

}

/**
 * An abstract class can include methods that contain no implementation. These methods without implementation are called abstract methods. The abstract method declaration must then end with a semicolon rather than a block.
 * if a class has abstract methods, wether declared or inherited, the entire class must be declared as abstract.
 * If a class is abstract, it is not necessary that it should have any abstract method, but if a class has an abstract method it must be abstract class.
 * An abstract class, may also have non-abstract methods.

**/