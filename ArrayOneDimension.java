package mySirGJava;

import java.util.Scanner;

public class ArrayOneDimension {

	public static void main(String[] args) {
	
		// different ways to declare and initialize the arrays.
				int arr2[] = {2, 4, 6, 9};
				int arr3[] = new int[] {2,4,5,6,8,10};
				int arr4[] = new int[5];
				int arr1[]; // reference variable of one dimensional array.
							// array declaration only.
				arr1 = new int[5]; // array initialization.
						
				arr1[0]=2; // assigning the values to array.
				arr1[1]=4;
				arr1[2]=6;
				arr1[3]=8;
				arr1[4]=9;
				
			int	arr1Length = arr1.length; // to determine the length of an array.
			System.out.println("length of arr1: "+arr1Length);
			
				for(int j=0; j<5; j++)
					System.out.println("arr1["+j+"]= "+arr1[j]);
				
			System.out.println("==========================================");
			
			// Another way of assinging the values to an arrary, values taken from users.
				int arr[] = new int [5]; // array declaration and initialization.
				
				Scanner sc = new Scanner(System.in); // taking the input from users.
				System.out.print("Please enter your 5 numbers: " );
				
				for(int i=0; i<5; i++) // taking vaues from users using loop.
					arr[i] = sc.nextInt(); // method in scanner class accepts values from users and stores in an array.
				
				System.out.println("Values of array arr: ");
				for (int i=0; i<5; i++) // printing the values entered by users from keyboard.
					System.out.println("arr["+i+"]="+arr[i]);
				
				sc.close();
				
				System.out.println("===================================");
				
				System.out.println("Number of values in arr: "+arr.length);
				System.out.println("Number of values in arr1: "+arr1.length);
				System.out.println("Number of values in arr2: "+arr2.length);
				System.out.println("Number of values in arr3: "+arr3.length);
				System.out.println("Number of values in arr4: "+arr4.length);
		}
		}
	

		/**
		 *Q1. Can arary be blank?
		 * Ans: array can not be blank, it contains default values like 0 in case of integer array, and null in case of String arrary.
		 * there is a length variable in an array which contains the number of variables in an array.
		 **/

	


