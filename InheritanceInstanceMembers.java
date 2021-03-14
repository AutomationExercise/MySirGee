package mySirGJava;

public class InheritanceInstanceMembers {
public static void main(String [] args)
{
	Students s1 = new Students(); // object of child class is accessing all methods from parent and child class.
	s1.setAge(25);
	s1.setName("Murad");
	s1.setRollno(10);
	System.out.println("Age: "+s1.getAge());
	System.out.println("Name: "+s1.getName());
	System.out.println("Rollno: "+s1.getRollno());
	
	Person p1 = new Person(); // object of parent class is only accessing method of parent class.
	p1.setAge(26);
	p1.setName("Sohail");
	System.out.println("Age -- Person: "+p1.getAge());
	System.out.println("Name -- Person: "+p1.getName());
	
	Person p2 = new Students(); // only parent class methods can be accessed.
	p2.setAge(27);
	p2.setName("Ayesha");
	System.out.println("Name -- p2: "+p2.getAge());
	System.out.println("Name -- p2: "+p2.getName());
}}

class Person{ // parent class, also called base class.
	private int age;
	private String name;
	
	public void setAge(int a) {
		age=a;
		System.out.println("method -- setAge -- Person class");
	}
	public void setName(String n) {
		name=n;
		System.out.println("method -- setName -- Person class");
	}
	public int getAge() {
		System.out.println("method -- getAge -- Person class");
		return (age);
	}
	public String getName() {
		System.out.println("method -- getName -- Person class");
		return (name);
	}
}

class Students extends Person{ // child class, also called as derived class.
	private int rollno;
	public void setRollno(int r) {
		rollno=r;
		System.out.println("method -- setRollno -- Students class");
	}
	public int getRollno() {
		System.out.println("method -- getRollno -- Students class");
		return (rollno);
	}
}


// Sub class is called child class or derived class.
// Super class is called parent class or base class.
// Extends keyword is used to create link between parent class and child class.
// In Java programing language, each class is allowed to have one direct superclass, and each superclass 	has the potential for an unlimited number of superclases.
// *Multiple inheritance in java is not allowed.
// Private members of the superclass are not accessible by the subclass and can only be indirectly accessed 	by private methods.
// * private members of parent/super class are inherited in child class but can not be accessed directly 	outside the class body.
// Memberes that have default accessibility in the superclass are also not accessible by superclass in 	other packages.
// java supports 3 types of inheritance:
// *1. Single inheritance, 2. Multi-level inheritance, 3. Hierarchical inheritance.

