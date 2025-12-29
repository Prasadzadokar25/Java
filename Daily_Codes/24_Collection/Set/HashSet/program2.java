
/* Concept : set allow us to add dublicate user define data because 
 */
import java.util.*;

class MyClass {

	String name = null;
	int jerNo = 0;

	MyClass(String name, int jerNo) {

		this.name = name;
		this.jerNo = jerNo;
	}
	/*
	 * public String toString() {
	 * 
	 * return "{" + name +" : "+jerNo+ "}" ;
	 * }
	 */

}

class HashSetDemo2 {

	public static void main(String args[]) {

		HashSet hs = new HashSet();

		hs.add(new MyClass("Rohit", 45));
		hs.add(new MyClass("Kohali", 18));
		hs.add(new MyClass("MSD", 7));
		hs.add(new MyClass("Rohit", 45));
		hs.add(new MyClass("Kohali", 18));

		System.out.println(hs); // if you do not override tostring it return address of objects

	}
}
