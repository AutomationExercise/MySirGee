package mySirGJava;

class ParentD
{
	public ParentD()
	{
		System.out.println("constructor -- ParentD");
	}
}
class ChildD extends ParentD
{
	public ChildD() // constructor with no arugument.
	{	// this() represent the constructor of the same class.
		this(5); // to invoke the constructor of the same class, this() keyword is used.
		System.out.println("constructor -- ChildD");
	
	}
	public ChildD(int x) // constructor with argument, must be invoked with this() keyword.
	{
		System.out.println("constructor -- ChildD with argument");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		ChildD obj = new ChildD();
		}
}

	
	/**
	 * Constructor can call other constructors of the same class or superclass.
	 * Constructor call from a constructor must be the first step. (call should appear in the first line).
	 * Such series of invocation of constructors is known as constructor chanining.
	 * First line of the constructor is either super() or this(). (by default it is super()).
	 * Constructor never contains both super() and this() keywords in the same constructor.
	 **/
