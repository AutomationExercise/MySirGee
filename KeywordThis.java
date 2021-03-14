package mySirGJava;

class Boxes
{
	int l, b, h; // instance member variables
	public void setDimensions(int l, int b, int h)
	{
		this.l=l; this.b=b; this.h=h; // local variables
		System.out.println("method -- setDimensions");
	}
	public void getDimensions()
	{
		System.out.println("method -- getDimensions");
		System.out.println("value of l: "+l);
		System.out.println("value of b: "+b);
		System.out.println("value of h: "+h);
	}
}

public class KeywordThis {

	public static void main(String[] args) {
		Boxes b1 = new Boxes();
		b1.setDimensions(10, 20, 30); // b1 is the calling object, so this keyword is a reference variable to b1 object.
		b1.getDimensions();

	}

}

	// this keyword is is a local reference variable in instance member functions of a class.
	// this keyword is always present in methods whether we use it or not.
	// this keyword is a reference variable in instance member functions which refer to the calling object.
	// this keyword is used as a reference to the current object which is an instance of the current class.
	// this keyword is useful in situations where a local variable hides or shadows a field with the same name.
	// this reference can not be used in a static context, as static code is not executed in the context of any object.






