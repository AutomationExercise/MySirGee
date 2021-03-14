package mySirGJava;

class A
{
	public void f1(int x)
	{
		System.out.println("method -- f1 -- class A");
	}
}

class B extends A
{
	public void f1(int x, int y)
	{
		System.out.println("method -- f2 --class B");
	}
}

public class FunctionOverloading {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.f1(5);
		obj.f1(5, 10);
	}
}

// if two methods of a class have the same name but difference in the signatures are called function/method overloading.
// method may be declared in the same class, may be inherited from the from the parent class, or one method may be in a child class and other method may be inherited from the parent.
// Method overloading is a way to implement polymorphism.
