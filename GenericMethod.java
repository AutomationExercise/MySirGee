package mySirGJava;

public class GenericMethod {

	public <E> void printArray(E []s) // generic method to print the array values of different data types.
	{
		/*for(int i=0; i<s.length; i++) // for loop to print the values of array.
		{
			System.out.println(s[i]);
		}
		*/
		for(E x:s) // For each loop to print/access the values of an array in sequence.
					// s is the name of an array.
					// x is variable which wil contain the value of array sequenctly.
					// E is data type for the array.
		{
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		String countries[]=new String[] {"Pakistan", "India", "Nepal"}; // string array to print.
		Integer numbers[]= {12, 24, 36, 48}; // integer array to print.
											// array can be directly initalized without the new keyword.
		GenericMethod gm = new GenericMethod(); // when we need to use the non-static method, we need to create the object of that class.
		
		gm.printArray(countries); // calling the function to print the string array in main method.
		gm.printArray(numbers);  // calling the function to print the integer array in main method.
}
}
 /**
  * generic method is used to overcome the method overloading.
  * type parameter can represent only reference type, not primitive types (int,double, char etc.)
  * all generic methods declarations have a type parameter section delimited by single angle brackets (<E>) 	that represents the method's return type.
  * type parameters can be used to declare the return type.
  * four types of loops are used to access the arrays:
  * 1. Do loop, 2. Do While loop, 3. For loop, and 4. For Each loop.
**/