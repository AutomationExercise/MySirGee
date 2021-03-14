package mySirGJava;

class GenericClass<T> { // T is place holder for data type.
	 T i; // i is variable that will contain the value we assign.
	 public void add(T i1)
	 {
		 i=i1; // assignin the value of i1 into the i variable through function.
	 }
	 public T get()
	 {
		 return(i);
	 }
	}

public class GenericClassConcepts {
	public static void main(String []args)
		{
			GenericClass<Integer> m1= new GenericClass<Integer>();
			GenericClass<String> m2= new GenericClass<String>();
			
			Integer k=new Integer(5);
			m1.add(k);
			m2.add("Rahul");
			
			System.out.println("m1= " +m1.get());
			System.out.println("m2= " +m2.get());
		}
	}
 /**
  * A generic class declaration looks like a non-generic class declaration, except that the class name is followed by a type parameter section.
  **/

