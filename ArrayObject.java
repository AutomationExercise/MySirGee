package mySirGJava;

public class ArrayObject {

	public static void main(String[] args) {
		// Oject array: is used to store different data type values.
		// Object is a class like String is a class.
		// Object is super class of all the classes.
		
		Object ob[] = new Object[6];
		ob[0] = "Murad"; // name
		ob[1] = 11; // age
		ob[2] = 12.33; // weight
		ob[3] = "1/1/2009"; // date of birth
		ob[4] = 'M'; // gender
		ob[5] = "Falls Church"; // city
		
		System.out.println(ob[0]); // print the value at index 0.
		System.out.println(ob[5]);
		
		System.out.println(ob.length); // print size of array.
		
		for(int i=0; i<ob.length; i++) // print all the values of Object array.
		{
			System.out.println(ob[i]);
		}
		
	}

}
