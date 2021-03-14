package mySirGJava;

class ParentC
{ int x;
	public ParentC(int a) // superclass constructor receiving aruguments, invoked by sub class instructor.
	{ x=a;
		System.out.println("ParentC -- supperclass constructor");
	}
}

class ChildC extends ParentC
{
	public ChildC() // subclass constructor
	{
		super(4); // super keyword is by default in the sub class constructor, if we do not write it.
		System.out.println("ChildC -- subclass contructor");
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		ChildC obj = new ChildC();
		System.out.println("value of x: "+obj.x); // value to variable x is initialized throgh super() keyword in the sub class constructor.
	

	}

}

/** 	- Constructors are not inherited by subclass.
		What happens when object of subclass is created?
		First child class constructor will be invoked, which then invokes the super class constructor.
		
		What is the role of constructor?
		Constructor initializes the object.
		
		Subclass's constructor invokes the constructor of super class.
		Explicit (forcefully) call to the super class constructor from the sub class's constructor can be made from super().
		We can write a sub class constructor that invokes the constructor of the super class, either implicitly or by using the keyword super.
		What are 4 possible scenarios for constructor?
			1. implicit (default) construcotrs in super class and sub class.
				-we dont need to create the constructor in super class and sub class.
			2. implicit constructor in sub class and explicti constructor in super class.
				-if the signature of constructor is receiving any argument, then we need to use the keyword super() in the sub class's constructor to invoke the super class's constructor.
				- if the signature of super class constructor is not receiving any argument, then no need to write the super() keyword in the sub class constructor.
			3. implicit constructor in super class and explicit constructor in sub class.
				- no need to write super() keyword in the constructor of sub class.
			4. explicit constructor in super class and sub class.
		Subclass constructor may take arguments for its own use, as well as for the constructor of superclass.
		
			**/
		