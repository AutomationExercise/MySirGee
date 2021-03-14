package mySirGJava;

import java.io.*;

public class FileOutputStreamClass {

	public static void main(String[] args) throws IOException {
		int i;
		
		FileOutputStream fout = new FileOutputStream("M:\\PractSel\\PractFile.txt", true); // true means to append the new writing into existing writing.
		String s = "This is what we want to write to file";
		
		char ch[] = s.toCharArray(); // to convert the string to char array.
		
		for(i=0; i<s.length(); i++) // loop to write to file.
			fout.write(ch[i]);
	
		fout.close(); // to save changes to hard disk.
	}

}

	/**
	 * Writing data to file means storing data in the file.
	 * FileOutputStream is a subclass of OutputStream class.
	 **/