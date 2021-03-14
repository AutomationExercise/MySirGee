package mySirGJava;

interface I3{
	void fun1(); // all methods are by default abstract within an interface.
	}
interface I4{
	void fun2();
}

class Person5{
	public void fun3()
	{
		System.out.println("method -- fun3 --Person5 class");
		
	}
	
}
class Student5 extends Person5 implements I3, I4 {
	public void fun4()
	{
		System.out.println("method -- fun4 -- Student5 class");
	}
	public void fun1() {
		System.out.println("method -- fun1 -- I3 interface -- override");
	}
	public void fun2() {
		System.out.println("method -- fun2 -- I4 interface -- override");
	}
}

public class InterfaceInheritance {

	public static void main(String[] args) {
		Student5 s5 = new Student5();
		s5.fun1();
		s5.fun2();
		s5.fun3();
		s5.fun4();

	}

}
