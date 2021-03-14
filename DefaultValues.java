package mySirGJava;

public class DefaultValues {

	//1. default value for primitive data types:
	static int i; 		// 0
	static double d; 	// 0.0
	 float f; 	// 0.0
	static boolean b; 	// true
	static char c; 		// blank
	
	// 2. default value for String class is null:
	static String str;
	
	// 3. default value of object reference or any variable will be null. It will be null for all classes.
	static Object obj;
	static Exception e;
	static System s;
	static KeywordNull kn;
	
	public static void main(String[] args) {
		
		//1. default value for primitive data types:
		System.out.println(i);
		System.out.println(d);
		System.out.println(kn.f); // non-staic member variable can be accessed by reference variable.
		System.out.println(b); // static member variable can be excessed by direct calling.
		System.out.println(KeywordNull.b); // static member can also be accessed by class followed by period.
		System.out.println("Default value for char is: "+c);
		
		// 2. default value for String class:
		System.out.println(str);
		
		// 1. default value of object reference or any variable will be null. It will be null for all classes.
				System.out.println(obj);
				System.out.println(e);
				System.out.println(s);
				System.out.println(kn);
				
				
				kn = new KeywordNull(); // create a reference varible for class.
				System.out.println(kn); // print the value of reference varibale.
				kn = null; // cancell  the reference variable for an object.
				System.out.println(kn); // print the value of object reference variable.
				
				
				
	}

}
