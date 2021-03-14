package mySirGJava;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		// pre-defined Scanner class is used to get values from user using keyboard.
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your values here:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int s = a+b;
		System.out.println("Sum of a and b is: "+s);
		kb.close();
	}

}
