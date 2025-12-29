/* concept = Adding data in the TreeSet
 *
 * TreeSet : TreeSet stores the data in sorting order
 * 	     TreeSet can store only comparable type data 
 */


import java.util.*;

class TreeSetDemo1 {

	public static void main(String args[]) {

		TreeSet ts = new TreeSet ();

		ts.add("prasad");
		ts.add("om");
		ts.add("hariom");
		ts.add("prasad");
		ts.add("Ankush");

		System.out.println(ts);
	}
}
