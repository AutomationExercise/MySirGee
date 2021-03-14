package mySirGJava;

public class ConstructorsConcept {
	private int l, b, h;
	
	public ConstructorsConcept() // constructor overloading: same constructor name as class name but difference in signature.
	{
		l=10; b=8; h=4; // fixed values
		System.out.println("constructor with no arguments");
	}
	public ConstructorsConcept(int L, int B, int H) // dynamic values as user can provide values during run time.
	{
		l=L; b=B; h=H;
		System.out.println("constructor with three arguments");
	}
	
	public static void main(String[] args) {
		ConstructorsConcept box1 = new ConstructorsConcept();
		ConstructorsConcept box2 =new ConstructorsConcept(20,15,5);
		
		System.out.println(box1.l);
		System.out.println(box1.b);
		System.out.println(box1.h);
		
		System.out.println(box2.l);
		System.out.println(box2.b);
		System.out.println(box2.h);
	}
}

 // constructor is used to initialize the object, and makes the object real object.
 // Constructor is a member function of a class.
 // Name of constructor is same as the name of the class.
 // constructor has no return type.
 // A constructor is a special method that is used to initialize a newly created object, and is called implicitly, just after the memory is allocated for the object.
 // It is not mandatory for a coder to write a constructor for the class.
 // when there is no constructor defined in the class by a programmer, compiler implicitly provide a default constructor for the class.
 // constructors can be parameterized -- arguments can be passed.
 // constructors can be overloaded.
