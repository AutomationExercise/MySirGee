package mySirGJava;

public class KeywordNull { // some cool facts about null.

	static Object obj;
	static String str;
	static int x;
	static double y;
	static float f;
	static boolean b;
	static char c;
	static Exception e;
	static System s;
	static KeywordNull kn;
	
	public static void main(String[] args) {
		
		 
		// 1. null keyword is case sensitive:
		// Object obj = null;
		
		// 2. default value of object reference or any variable will be null. It will be null for all classes.
		System.out.println(obj);
		System.out.println(str);
		System.out.println(x);
		System.out.println(y);
		System.out.println(f);
		System.out.println("Character default value: "+c);
		System.out.println(e);
		System.out.println(b);
		System.out.println(kn);
		
		kn = new KeywordNull();
		System.out.println(kn);
		kn = null;
		System.out.println(kn);
	}

}
