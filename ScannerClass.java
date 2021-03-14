package mySirGJava;

import java.util.Scanner;

public class ScannerClass { // is used for taking inputs from keyboard.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name; // declare variables.
		int age;
		
		System.out.print("What is your name: "); // prompt the user and take input from user.
		name = scan.next(); // method in the scanner class to take words.
		
		System.out.print("What is your age: ");
		age = scan.nextInt(); // method in scanner class to take integer input from user.
		
		System.out.print("Your name is "+name+ " and you are "+age+" years old.");
		scan.close();
	}

}

/** 
 * Scanner class is a part of java.util package.
 * Scanner is a final class, that is it can not be extended.
 * We can read java input from System.in object using Scanner class.
 * Scanner class breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
 * The resulting tokens may then be converted into values of different types using the various next methods.
 * 
**/