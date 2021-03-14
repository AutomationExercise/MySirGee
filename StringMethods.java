package mySirGJava;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = new String("computer");
		System.out.println(s1);
		
		// to convert the string value into upper case and lower case.
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		
		String s3 = s1.toLowerCase();
		System.out.println(s3);
		
		// to find the index of characters and strings.
		s1.indexOf('m');
		System.out.println("Index of m is: "+s1.indexOf('m')); // to find the index of a character within a string.
	
		int i = s1.indexOf("put"); // to find the index of a substring within a string.
		System.out.println("Index of string put is: "+i);
	
		// to compare the two String values.
		String s4 = new String("Computer");
		String s5 = new String("computer");
		
		boolean comp = s4.equals(s5); // equals() returns boolean value.
		if(comp)
			System.out.println("Strings are same");
		else
			System.out.println("Strings are not same");
		
		if(s4.equals(s5)) // compares exact String values and return bolean value.
			System.out.println("Srtings are same");
		else
			System.out.println("Strings are not same");
		
		if(s4.equalsIgnoreCase(s5)) // compares two Strings regardless of case values, and returns the boolean value.
			System.out.println("Srtings are same");
		else
			System.out.println("Strings are not same");
		
			}
	}
		