package mySirGJava;

public class Student {
	int marks; // instance member variables are not initialized, so contain the defalt values.
	String name;// contain default value of null
	String subject; // default value -- null
	
	public void setMarks(int m)
	{ marks = m;
		System.out.println("method -- setMarks");
	}
	public void setName(String n) {
		name = n;
		System.out.println("method -- setName");
	}
	public void setSubject(String s) {
		subject = s;
		System.out.println("method -- setSubject");
	}
	public int getMarks() {
		System.out.println("method -- getMarks");
		return (marks);
	}
	public String getName() {
		System.out.println("method -- getName");
		return name;
	}
	public String getSubject() {
		System.out.println("method -- getSubject");
		return subject;
	}
}
