package mySirGJava;

final class Dummy // final class
{
	public void fun1()
	{
		System.out.println("method -- fun1 -- Dummy class");
	}
}
 
// final Dummy class can not have child class as MoreDummy.

/*
 * class MoreDummy extends Dummy { public void fun2() {
 * System.out.println("method -- fun2 -- MoreDummy class"); } }
 */
 

public class KeywordFinalClass {

	public static void main(String[] args) {
		// MoreDummy md = new MoreDummy();
		// md.fun2();
		// md.fun1();
		Dummy d = new Dummy();
		d.fun1();

	}
}

 // java classes declared as final can not be extended. Restricting inheritance.