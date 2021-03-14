package mySirGJava;

public class ArrayTwoDimensions {

	public static void main(String[] args) {
		
	
		String x[][]=new String[2][3]; // creating 2-dimensional array.
		
		x[0][0] = "A"; // assigning values in 2-dimensional array.
		x[0][1] = "B";
		x[0][2] = "C";
				
		x[1][0] = "D";
		x[1][1] = "E";
		x[1][2] = "F";

		int row;
		int col;
		// .length is a pre-defined variable in each array which contains the length of an array.
		
		System.out.println("Row length: "+x.length); // determing the row length.
		System.out.println("Column length: "+x[0].length); // determing the column length.
		System.out.println("Column length: "+x[1].length);
		
		for( row=0; row < x.length; row++) { // printing the values of 2-dimensional arry.
			for(col=0; col < x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}
	}
	}


