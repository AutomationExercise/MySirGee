package mySirGJava;

public class KeywordFinalInstanceMemberVariables {
 private final int x=5; // instance member variable
 						// default value of x is zero.
 private final int y; // value of y with final keyword will be blank.
 private final int z;
 
 {
	 y=10; // initialization block
 }
 
 public KeywordFinalInstanceMemberVariables()
 {
	 z=15; // constructor
 }
	public static void main(String[] args) {
		KeywordFinalInstanceMemberVariables e1 = new KeywordFinalInstanceMemberVariables();
		System.out.println("value of x: "+e1.x);
		System.out.println("value of y: "+e1.y);
		System.out.println("value of y: "+e1.z);

	}

}
	// final keywor can be used at 5 places:
 //* 1. final instance variable
 //* 2. final static variable
 //* 3. final local variable
 //* 4. final methods
 //* 5. final class

 // final instane member variable:
 // * A variable that is declared as final and not initialized is called a blank final variable. A blank final variable forces either the consturctors to initialize it or initialization block to do this job.


