package mySirGJava;

import java.io.File;

public class FileClass {

	public static void main(String[] args) { // File class object provides information about file (metadata), not the content of file.
		
		File file = new File("M:\\PractSel\\PractFile.txt"); // file path as a string in the constructor.
		
		System.out.println("Is file exist: "+file.exists()); // to return boolean value, whether file exists or not.
		System.out.println("File name: "+file.getName());
		System.out.println("Can file write: "+file.canWrite()); // returns boolean value.
		System.out.println("Can file read: "+file.canRead()); // returns boolean value.
		System.out.println("Length of file: "+file.length());
		System.out.println("File path: "+file.getPath());
	// 	file.delete(); // to delete the file.
	}

}

	/**
	 * An abstract representation of file and directory pathnames.
	 * Object of File class will access the characteristics of file (metadata) such as file name, file length, file is present or not.
	 **/
	 