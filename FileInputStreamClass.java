package mySirGJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamClass {

	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin;
		fin = new FileInputStream("M:\\PractSel\\PractFile.txt");
		
		do {i=fin.read(); 		// fin.read method with read the characters from the file and return them in the i variable.
		if(i!=-1) 				// if the value of is not -1, then print the charcaters from the file.
			System.out.print((char)i); // because i is int type so typecast it into char.
			
		}while(i!=-1); // continue the loop untill the value of i is -1.
		 
		fin.close();
	}

}

	
	/**
	 * Reading data from file means extracting data stored in the file (without deleting the data from the file).
	 * FileInputStream class has two major types of constructors.
	 	1. FileInputStream (File file) where we first create the object of the File class and then pass that object in the constructor which opens the connection to the actual file.
	 	2. FileInputStream (String name) where we pass the file path in the consructor as a String which opens the connection to the actual file.
	 *
	 **/