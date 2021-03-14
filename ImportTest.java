package mySirGJava;

import refresh.knowledge.ImportStudent;

public class ImportTest {

	public static void main(String[] args) {
		ImportStudent student = new ImportStudent();
		student.setRollno(100);
		student.setName("Sohail");
		int rollno = student.getRollno();
		student.getName();
		
		System.out.println("Role No: "+rollno);
		System.out.println("Name: "+student.getName());
	}
}
	//*** student information is imported from another package refresh.knowledge.ImprotStudent.
	// object of Student class is created to access information from Student class. 