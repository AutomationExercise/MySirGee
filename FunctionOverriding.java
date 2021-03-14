package mySirGJava;

class A1
{
 public void f1(int x)
 {
	 System.out.println("method -- class A");
 }
}

class B1 extends A1
{
	public void f1(int x)
	{
		System.out.println("method -- class B");
	}
}
public class FunctionOverriding {

	public static void main(String[] args) 
	{
		B1 b=new B1(); // creating the object of child class.
		b.f1(5);
		b.f1(10);
		A1 a = new A1(); // creating the object of parent class.
		a.f1(15);
		A1 a1 = new B1(); // object of child class refered by parent class. still the child class method will override the parent class method.
		a1.f1(20);
	}
}

 // overriding functions must have the same name and signarures but difference in implementation (coding).
 // one method must be in parenet class and the other method in the child class.
 // child class method will override the parent class method.
 // follows is-a-relationship like sportcar is a car or student is-a person.
 //
