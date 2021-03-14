package mySirGJava;

public class StringClass {

	public static void main(String[] args) {
		String str1= "My name is Bond"; // this is how, the object of String is created.
										// there is no need to write the keyword new to create the object of String class.
		System.out.println("Length of string: "+str1.length());
		
		String s1 = "computer";
		String s2 = "computer";
		String s3 = new String("computer"); // new keyword creates a new object each time.
		String s4 = new String("computer");
		
		System.out.println("Result 1: "+(s1==s2)); // true. // here we compare the two references which are refering to the string i.e. computer is this case.
		System.out.println("Result 2: "+s1.equals(s2)); //true. // here we compare the string, to which the s1 and s2 are referencing.
		System.out.println("Result 3: "+(s1==s3)); // false, new keyword creates a new object even though it has the same string value 'computer'.
		System.out.println("Result 4: "+s1.equals(s3)); // true, because the value is same in both strings 'computer'.
		System.out.println("Result 5: "+(s3==s4)); // false, because new keyword each time creates a new object.
		System.out.println("Result 6: "+s3.equals(s4)); // true, because the string values are same in both objects i.e. 'computer'.
	
	
	}
		// .equals() method compares the two strings.
		// == compares two reference varibales of objects.
}

	/**
	 * String class is in java.lang.String package.
	 * String class is final class which means this class can not be extended by other class. 
	 * String class is final so it can not be inherited/ extended by other child classes.
	 * String class is an immutable class, i.e. once this class is created and initialized, it can not be changed on the same reference.
	 * if two of more Strings have the same set of characters in the same sequence, they can share the same reference in the memory.
	 		String str1 = "My name is Bond";
	 		String str2 = "My name is Bond";
	 		String str3 = "My name"+"is Bond";
	 		All the above mensionded String references str1, str2, str3 denote/refer to the same String object, no new object will be created in the memory.
	 * **/
	