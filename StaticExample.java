package mySirGJava;

public class StaticExample {

	int x;
	static int y;
	
	public void fun1() {
		System.out.println("fun1 -- non-static method");
	}
	
	public static void fun2() {
		System.out.println("fun2 -- static method");
	}
	
	public static void main(String[] args) {
		StaticExample se = new StaticExample();
		se.x=2;
		se.fun1(); // non-static member function is called by creating the object of the class.
		
		se.fun2(); // static member function can be called by creating the object of the class but it is not a recommedned way.
		
		StaticExample.y=4; // 1st way: static member variable and method are called by class name and dot operator.
		StaticExample.fun2();
		
		fun2(); // 2nd way: static member variable and method are called dircetly.
		y=6;
		
		Example2 e2 = new Example2(); // create objec of external class.
		e2.b=4;
		e2.fun4(); // calling non-static function by object.
		
		Example2.c=7;
		System.out.println(Example2.c);
		Example2.fun3(); // calling static function by class name.
		
		Example2.Example3.d=8;
		System.out.println(Example2.Example3.d);
		Example2.Example3.fun5();
	}
}

 class Example2 { // outer class
	int b;
	static int c;
	
	public static void fun3() {
		System.out.println("fun3 -- static method inside Example2");
	}
	
	public void fun4() {
		System.out.println("fun4 -- non-static method inside Example2");
	}
	
	public static class Example3{ // inner class
		int c;
		static int d;
		public void fun6() {
			System.out.println("fun6 -- non-staic method inside inner class Example3");
		}
		public static void fun5() {
			System.out.println("fun5 -- staic method inside inner class Example3");
		}
	}
}

 
 
 
 