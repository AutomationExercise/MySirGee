package mySirGJava;

abstract class Person1 // abstract classes are declared with the abstract keyword.
{
	private String name;
	private int age;
	public void setName(String n)
	{
		name = n;
		System.out.println("method -- setName --Person class");
	}
	public void setAge(int a) {
		age = a;
		System.out.println("method -- setAge -- Person class");
	}
}

public class AbstractClass { 

	public static void main(String[] args) {
		Person1 p = new Person1(); // can not instantiate the type Person, because the object of an abstract class can not be inintialized.
		p.setAge(25);
		p.setName("Arif");
		
		
	}
}
  /**
   * Java abstract classes are used to declare common characteristics of subclasses.
   * An abstract class can not be instantiated (object of a class can not be created).
   * An abstract class have the variables and functions like other classes, which can be used by making the subclass of the abstract class.
   * Ab abstract class can only be used as a superclass for other classes that extend the abstract class.
   * Like any other class, an abstract class can contain fields that describe the characteristics and methods that describe the actions that a class can perform.
   * We can not create object of abstract class but we can create the reference variable of abstract class.
  
    **/