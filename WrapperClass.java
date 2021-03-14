package mySirGJava;

public class WrapperClass {

	public static void main(String[] args) {
		// how use valueOf() function:
		// static method, so directly call by the wrapper class name.
		// returns object reference of relative wrapper class.
		Integer i1 = Integer.valueOf("3"); // valueOf function will return the object of class Integer which will contain the specfied value in the form of String.
		Double d1 = Double.valueOf("3.14"); // the object will be referenced by a reference variable of its specific class.
		System.out.println(i1);
		System.out.println(d1);
		
		// how use parsexxx() function:
		// static method, so directly call by the wrapper class name.
		// xxx can be replaced by any primitive type
		// returns xxx type value.
		int a = Integer.parseInt("123"); // parseInt function will convert the string value into int, which will be stored in an int variable a.
		double d = Double.parseDouble("13.45");
		System.out.println(a);
		System.out.println(d);
		
	}
}
	// What are Wrpper Classes in JAVA?
	// JAVA is 99% OOP. Java is an object-oriented language and sa said everything in Java is an object. But primitive data types are not objects.
	// As a solution to this problem, Java gives the concept of Wrapper classes. There is wrapper class for every primitive data type in Java.
	// Primitive type --> Wrapper Class
	// boolean	--> Boolean
	// byte		--> byte
	// char		--> Character
	// short	--> Short
	// int		--> Integer
	// long		--> Long
	// float	--> Float
	// double	--> Double