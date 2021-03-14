package mySirGJava;

class Base
{ int x, y;
	public void fun1()
	{
		System.out.println("method -- fun1 -- Base class");
	}
}
class Child extends Base
{ int x, z;
	public void fun2()
	{
		System.out.println("method -- fun2 -- Child class");
	}
	public void setValues(int b, int c)
	{
	this.x=b;
	z=b;
	super.x=c;
	y=c;
	System.out.println("method -- fun3 -- Child class");
	}
	public void getValues()
	{
		System.out.println("method -- getValues -- Child class");
		System.out.println("value of Child class x: "+this.x);
		System.out.println("value of Child class z: "+z);
		System.out.println("value of Base class x: "+super.x);
		System.out.println("value of Base class y: "+y);
	}
}

public class KeywordThisAndSuper {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.fun1();
		ch.fun2();
		ch.setValues(10,15);
		ch.getValues();
	}
}
