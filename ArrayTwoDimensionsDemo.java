package mySirGJava;

public class ArrayTwoDimensionsDemo {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];
		
		System.out.println(x.length); // total number of rows = 3.
		System.out.println(x[0].length); // total number of columns = 5.
										// x[0] is the 1st row of array, and x[1] is the 2nd row.
		
		// 1st row:
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		// 2nd row:
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		// 3rd row:
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		// print individual values from an array.
		System.out.println(x.clone()[1][1]);
		System.out.println(x.clone()[2][2]);
		
		// print all the values from 2d array.
		/** logic befind for loop;
			row =0, col =0-4
			row =1, col =0-4
			row =2, col =0-4
		**/
		
		for(int row=0; row<x.length; row++)
		{
			for(int col=0; col<x[0].length; col++)
				System.out.println(x[row][col]);
		}
	}

}
