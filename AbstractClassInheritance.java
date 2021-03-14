package mySirGJava;

abstract class Person2
{
	private String name; // private variables are only accessed by same class methods, not by subclass functions.
	int age; // can be accessed by subclass function.
	public void setName(String n) {
		name = n;
		System.out.println("method -- setName -- Person2 class");
	}
	public void setAge(int a) {
		age = a;
		System.out.println("method -- setAge -- Person2 class");
	}
	public String getName() {
		System.out.println("method -- getName -- Person2 class");
		return (name);
	}
}

class Student2 extends Person2
{
	public int getAge() {
		System.out.println("method -- getAge -- Student class");
		return (age);
	}
}

public class AbstractClassInheritance {

	public static void main(String[] args) {
		
		// Person2 p2 = new Person2(); object of abstract class Person2 can not be instantiated.
		Student2 s2 = new Student2(); // object of subclass of an abstract class can be created.
		s2.setName("Raja");
		s2.setAge(35);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		
		System.out.println("=============================================");
		
		Person2 p2 = new Student2(); // astract class can have a reference for its subclass.
		p2.setAge(30);				// it can only access the functions of the super class.
		p2.setName("Feroze");
		System.out.println(p2.getName());
	}

}
