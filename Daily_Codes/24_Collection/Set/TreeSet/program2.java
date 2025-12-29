/* Adding user difine data in TreeSet 
 *
 * Note : we can not add user define data in TreeSet directly
 * 	  becouse user define data is not comparable , so we need 
 * 	  to make it compareable
 */



import java.util.*;

class TreeSetDemo2 implements Comparable {

	String str = null;
	
	TreeSetDemo2(String str) {

		this.str = str ;
	}
	public int compareTo(Object obj) {

		return str.compareTo(((TreeSetDemo2)obj).str);  // we cast the Object class into TreeSetDemo2

	}
	public String toString(){

		return str;
	}
	public static void main(String args[] ){

		TreeSet ts = new TreeSet ();

		ts.add(new TreeSetDemo2("Kanha"));
		ts.add(new TreeSetDemo2("Ashish"));
		ts.add(new TreeSetDemo2("Rahul"));
		ts.add(new TreeSetDemo2("Badhe"));

		System.out.println(ts);
	}
}
