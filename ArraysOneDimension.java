package mySirGJava;

public class ArraysOneDimension {

	public static void main(String[] args) {
		// double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d[2]);
		
		// char array:
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = '2';
		c[2] = '$';
		
		System.out.println(c[2]);
		
		// boolean array:
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[0]);
		
		// String array:
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "World";
		
		System.out.println(s[1]);
		System.out.println(s.length);
	}
}
		/**
		 * Advantage of array: it stores multiple values.
		 * Disadvantage of array:
		 	1. array size is fixed -- called static array.. To overcome this problem -- we use Collections such as ArrayList, HashTable .. called dynamic arrays.
		 	2. stores only similar data types -- int array stores only int values, String array stores only String values etc. To overcome this problem .. we use Object array.
		 **/