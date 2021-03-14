package mySirGJava;

public class ArrayOneDimensionDemo {

	public static void main(String[] args) {
		// array: to store similar data type values in an array variable.
		
		// 1. int array:
		// lowes bound/index = 0
		// upper bound/index = n-1 (n is size of array)
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		// System.out.println(i[4]); // ArrayOutOfBoundException, because no index at position 4.
		
		// print all the values of array: use for loop.
		
		for(int j=0; j<i.length; j++)
		{
			System.out.println(i[j]); // i of j
		}

	}

}
