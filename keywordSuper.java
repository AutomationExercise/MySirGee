package mySirGJava;

class AA
{ int x; // instance member variable of superclass.
	public void fun1()
	{
		System.out.println("method -- fun1 -- superclass A");
	}
}
class BB extends AA
{ int x; // instance member variable of subclass.
	public void fun1() // this method will override the fun1 in superclass.
	{					// super keyword will override the overridden method in subclass.
		super.fun1(); // this method will call fun1() method within the subclass.
		//System.out.println("method -- fun1 -- subclass B");
	}
	public void fun2() // this function has the right to access its local variables and the instance member variables of the superclass and subclass as well.
	{ int x; // local member variable.
		x=5;
		this.x=10; // this reference variable is of subclass type.
		super.x=15; // super reference variable is of superclass type.
		
		System.out.println("method -- fun2 -- subclass B");
		System.out.println("value of local variable x: "+x);
		System.out.println("value of superclass x: "+this.x);
		System.out.println("value of subclass x: "+super.x);
	}
}

public class keywordSuper {// 2 uses of super keyword:
						// * 1. invoke the overriden method in the supclass.
						// * 2. avoids the name conflict between member varables of superclass and subclass.

	public static void main(String[] args) {
		BB obj = new BB();
		obj.fun1();
		obj.fun2();
	}

}
	// In inheritance, when a subclass object calls an instance member function of subclass only, function contains implicitly two reference variables --this and super -- both refering to the current object (object of subclass).
	// The only difference in this and super keyword is:
	// * 1. this reference variable is of subclass type.
	// * 2. super reference variable is of superclass type.
	// If the method overrides one of its superclass's method, we can invoke the superclass version of the method through the use of super keyword.
	// super keyword avoids name conflict between member variables of the superclass and subclass.
	//