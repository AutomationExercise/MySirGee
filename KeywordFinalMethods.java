package mySirGJava;

class Dummy1
{
	public final void someFunction() // final method can not be overridden in the child class.
	{
		System.out.println("method -- someFunction -- Super Dummy class");
	}
}

class MoreDummy extends Dummy1
{
 public void someFunction() // this method can not override the final method in parent class.
 {
	 System.out.println("method -- someFunction -- Derived MoreDummy class");
 }
}

public class KeywordFinalMethods {

	public static void main(String[] args) {
		Dummy1 d = new Dummy1();
		d.someFunction();
		MoreDummy md = new MoreDummy();
		md.someFunction();
		
		

	}

}

 // Methods declared as final can not be overridden.
