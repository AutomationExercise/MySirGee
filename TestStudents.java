package mySirGJava;

public class TestStudents {

	public static void main(String[] args) {
		Student st = new Student(); // creating the object of Student class.
		
		System.out.println("Marks: "+st.marks); // accessing the instance (oject) member variables. will print default values.
		System.out.println("Name: "+st.name);
		System.out.println("Subject: "+st.subject);
		
		st.setMarks(80); // setting the values for instance member variables.
		st.setName("Murad");
		st.setSubject("Math");
		
		System.out.println("Marks: "+st.getMarks());
		System.out.println("Name: "+st.getName());
		System.out.println("Subject: "+st.getSubject());
	}
}
