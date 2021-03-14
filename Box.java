package mySirGJava;

public class Box {

	int length, breadth, height; // instance member variables: properties of class.
	
	public void setDimension(int l, int b, int h) // instance member function, because these functions can only be called by creating the objects/instance. 
	{
		length=l; breadth=b; height=h;
	}
	
	public void showDimension() // instance member function: behaviour of class.
	{
		System.out.println("L="+length);
		System.out.println("B="+breadth);
		System.out.println("H="+height);
	}
	
	public static void main(String[] args) {
		Box smallBox=new Box(); // creates a object of Box class
		smallBox.setDimension(12, 10, 5);
		smallBox.showDimension();
		
		smallBox=new Box(); // creates the new object of Box class. the smallBox reference variable is now pointing to new object. the previous object will be now garbage item.
		smallBox.showDimension();

	}

}
	// Objects are always created dynamically in Java with the new keyword.
	// Box smallBox=new Box()
	// Box -- is class
	// smallBox -- instance variable of object
	// new keyword -- creates new object of class Box dynamically
	// new Box() -- object of class Box
	// instance member variables are also called as properties of class
	// instance member functions/methods are also called as behaviour of class.
