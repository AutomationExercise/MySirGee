package mySirGJava;

interface I1{
	String name = "Sohail"; // variables are by default public, static and final in interfaces.
	void setName(); // methods are by default public, non-static and abstract in interfaces.
	String getName();
}

class Person4 implements I1 // class implements the interface.
{
	public void setName() {
		
	System.out.println("method -- setName");// class must override the functions in interface.
	}
	public String getName() {
		System.out.println("method -- getName");
		return (name);
	}
}

public class InterfaceConcepts {
 public static void main(String[]args) {
	 Person4 p4 = new Person4();
	 p4.setName();
	 System.out.println(p4.getName());
 }
}


/** 
 * Interfaces just specify the method declaration (implicitly public and abstract), and only contain fields (implicitly public, static, and final).
 * Interface like that of an abstract class can not be instantiated.
 * Interface do not have constructors.
 * Why no constructors in Interface? Constructor is used to initialize the instance (object) member variables in a class. Interfaces have only static variables, so no need of constructor in Interface.
 * if a class that implements an interface does not define all the methods of the interface, then it must be declared abstract and the method definition should be provided by the subclass that extends the abstract class.
 * Multiple extension is allowed when extending interfaces i.e. one interface can extend none, one or more interfaces.
 * We can not create an object of any interface but interface can contain the refrence of an object.
 * Object reference of interface can refer to any of its subclass type.
 **/